package com.example.ddd_example.domain.iRepository;

import com.example.ddd_example.domain.model.mWorkHistory;

import java.sql.SQLException;
import java.util.List;

public interface iWorkHistory {

    List<mWorkHistory.WorkHistory_Get_Response> Get(mWorkHistory.WorkHistory_Get_Request get_request) throws SQLException;

    String Add(mWorkHistory.WorkHistory_Add_Request add_request ) throws  SQLException;

}
