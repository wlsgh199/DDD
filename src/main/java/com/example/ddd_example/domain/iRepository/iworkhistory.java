package com.example.ddd_example.domain.iRepository;

import com.example.ddd_example.domain.entity.workhistory;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@Repository
public interface iworkhistory {
    public Boolean InsertWorkHistory();

    public List<workhistory> SelectWorkHistory(int user_code, String start_date, String end_date);
}
