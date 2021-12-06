package com.example.ddd_example.application;

import com.example.ddd_example.config.HttpHeader;
import com.example.ddd_example.domain.model.mAccount;
import com.example.ddd_example.infrastructure.Account;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping("/api/v1.0")
public class AccountController {

    @GetMapping("user")
    @ApiOperation(value="User 조회", notes="해당 유저를 조회한다.")
    public ResponseEntity Get (mAccount.Account_Get_Request dto) {

        try {
            Account account = new Account();
            return ResponseEntity.ok()
                    .headers(HttpHeader.Default())
                    .body(account.Get(dto));
        }
        catch (SQLException e) {
            return ResponseEntity
                    .badRequest()
                    .headers(HttpHeader.Default())
                    .body(e.getMessage());
        }
    }

    @PostMapping("user")
    @ApiOperation(value="User 생성", notes="유저를 생성한다.")
    public ResponseEntity Add (@RequestBody mAccount.Account_Add_Request model){

        try {
            Account account = new Account();
            return  ResponseEntity.ok()
                    .headers(HttpHeader.Default())
                    .body(account.Add(model));
        }
       catch (SQLException e) {
            return ResponseEntity.badRequest()
                    .headers(HttpHeader.Default())
                    .body(e.getMessage());
        }
    }

    @DeleteMapping("user")
    @ApiOperation(value="User 삭제", notes="유저를 삭제한다.")
    public ResponseEntity Delete ( mAccount.Account_Delete_Request model){

        try {
            Account account = new Account();
            return  ResponseEntity.ok()
                    .headers(HttpHeader.Default())
                    .body(account.Delete(model));

        }
        catch (SQLException e) {
            return ResponseEntity.badRequest()
                    .headers(HttpHeader.Default())
                    .body(e.getMessage());
        }
    }

    @PutMapping("user")
    @ApiOperation(value="User 수정", notes="유저를 수정한다.")
    public ResponseEntity Put (mAccount.Account_Put_Request model){

        try {
            Account account = new Account();
            return  ResponseEntity.ok()
                    .headers(HttpHeader.Default())
                    .body(account.Put(model));

        }
        catch (SQLException e) {
            return ResponseEntity.badRequest()
                    .headers(HttpHeader.Default())
                    .body(e.getMessage());
        }
    }



    @GetMapping("users")
    @ApiOperation(value="User 조회", notes="전체 유저를 조회한다.")
    public ResponseEntity Gets () {
        try {
            Account account = new Account();
            return ResponseEntity.ok()
                    .headers(HttpHeader.Default())
                    .body(account.GetAll());
        }
        catch (SQLException e) {
            return ResponseEntity.badRequest()
                    .headers(HttpHeader.Default())
                    .body(e.getMessage());
        }
    }


}
