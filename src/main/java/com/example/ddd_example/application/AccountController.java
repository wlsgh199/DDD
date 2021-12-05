package com.example.ddd_example.application;

import com.example.ddd_example.domain.model.mAccount;
import com.example.ddd_example.infrastructure.Account;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api/v1.0")
public class AccountController {

    @GetMapping("user")
    @ApiOperation(value="User 조회", notes="해당 유저를 조회한다.")
    public mAccount.Get_Account_Response GetUser (mAccount.Get_Account_Request dto) {

        try {
            Account account = new Account();
            return account.Get(dto);
        }
        catch (SQLException e) {
            return null;
        }
    }

    @PostMapping("user")
    @ApiOperation(value="User 생성", notes="유저를 생성한다.")
    public String AddUser (@RequestBody mAccount.Add_Account_Request model){

        try {
            Account account = new Account();
            return  account.Add(model);
        }
       catch (SQLException e) {
            return e.toString();
        }
    }

    @GetMapping("users")
    @ApiOperation(value="User 조회", notes="전체 유저를 조회한다.")
    public List<mAccount.Get_Account_Response> GetUsers () throws SQLException {

        Account account = new Account();
        return account.GetAll();
    }





}
