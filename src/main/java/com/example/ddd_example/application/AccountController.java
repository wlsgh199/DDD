package com.example.ddd_example.application;

import com.example.ddd_example.domain.model.mAccount;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/user")
public class AccountController {

    @GetMapping("")
    @ApiOperation(value="User 조회", notes="모든 유저를 검색한다.")
    public mAccount.Get_Response GetUser (mAccount.Get_Request dto) {

        return null;
    }

    @PostMapping("")
    @ApiOperation(value="User 생성", notes="유저를 생성한다.")
    public mAccount.Add_Response AddUser (mAccount.Add_Request dto){
        return null;
    }



}
