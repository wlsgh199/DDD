package com.example.ddd_example.application;

import com.example.ddd_example.config.HttpHeader;
import com.example.ddd_example.domain.model.mWorkHistory;
import com.example.ddd_example.infrastructure.WorkHistory;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping("/api/v1.0/")
public class WorkHistoryController {

    @GetMapping("workhistory")
    @ApiOperation(value="WorkHistory 조회", notes="id , 시작일, 종료일로 작업 내역을 조회한다.")
    public ResponseEntity GetWorkHistory (mWorkHistory.WorkHistory_Get_Request model) {

        try {
            WorkHistory workHistory = new WorkHistory();
            return ResponseEntity.ok()
                    .headers(HttpHeader.Default())
                    .body(workHistory.Get(model));
        }
        catch(SQLException e){
            return ResponseEntity
                    .badRequest()
                    .headers(HttpHeader.Default())
                    .body(e.getMessage());
        }
    }

    @PostMapping("workhistory")
    @ApiOperation(value="WorkHistory 추가", notes="작업 내역을 생성한다.")
    public ResponseEntity AddWorkHistory (@RequestBody mWorkHistory.WorkHistory_Add_Request model ){
        try {
            WorkHistory workHistory = new WorkHistory();
            return ResponseEntity
                    .ok()
                    .headers(HttpHeader.Default())
                    .body(workHistory.Add(model));
        }
         catch(SQLException e){
            return ResponseEntity
                    .badRequest()
                    .headers(HttpHeader.Default())
                    .body(e.getMessage());
        }
    }


}
