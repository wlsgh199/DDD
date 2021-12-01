package com.example.ddd_example.domain.iRepository;

import com.example.ddd_example.domain.dto.workhistoryDTO;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository

public interface iworkhistory {
    public Boolean InsertWorkHistory();

    public List<workhistoryDTO> GetWorkHistoryList(int user_code, String start_date, String end_date) throws SQLException;
}
