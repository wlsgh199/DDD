package com.example.ddd_example.application;

import com.example.ddd_example.domain.iRepository.iworkhistory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0")
public class MainController {

    private final iworkhistory workhistory = null;

    @PostMapping("/insertwork")
    public String insertwork (){
        return "hi";
    }
    @GetMapping("/selectwork")
    public String selectwork ( ){
        return "hi";
    }

    @GetMapping("/selectworkhistory")
    public List<com.example.ddd_example.domain.entity.workhistory> SelectWorkHistory ( ){
        return workhistory.SelectWorkHistory(1,"2021-11-20","2021-11-28");
    }

}
