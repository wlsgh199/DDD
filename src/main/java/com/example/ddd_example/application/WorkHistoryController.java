package com.example.ddd_example.application;

import com.example.ddd_example.config.DataBase;
import com.example.ddd_example.infrastructure.workhistory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/workhistory")
public class WorkHistoryController {

    @GetMapping("/get")
    public void getWorkHistory ( ) throws Exception {
        workhistory test = new workhistory();
        test.GetWorkHistoryList(1,"","");
//        return
    }

}
