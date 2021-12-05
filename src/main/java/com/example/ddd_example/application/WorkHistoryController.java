package com.example.ddd_example.application;

import com.example.ddd_example.domain.model.mWorkHistory;
import com.example.ddd_example.infrastructure.WorkHistory;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/workhistory")
public class WorkHistoryController {

    @GetMapping("")
    @ApiOperation(value="WorkHistory 조회", notes="id , 시작일, 종료일로 작업 내역을 조회한다.")
    public List<mWorkHistory.Get_Response> GetWorkHistory (mWorkHistory.Get_Request model) throws Exception {

        WorkHistory workHistory = new WorkHistory();
        return workHistory.Get(model);
    }

    @PostMapping("")
    @ApiOperation(value="WorkHistory 추가", notes="작업 내역을 생성한다.")
    public String AddWorkHistory (@RequestBody mWorkHistory.Add_Request model ) throws Exception {
        WorkHistory workHistory = new WorkHistory();
        return workHistory.Add(model);
    }


}
