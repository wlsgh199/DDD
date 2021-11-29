package com.example.ddd_example.infrastructure;

import com.example.ddd_example.domain.iRepository.iworkhistory;

import java.util.List;

public class workhistory implements iworkhistory {

    public Boolean InsertWorkHistory()
    {
        return true;
    }

    @Override
    public List<com.example.ddd_example.domain.entity.workhistory> SelectWorkHistory(int user_code, String start_date, String end_date)
    {

        return null;
    }
}
