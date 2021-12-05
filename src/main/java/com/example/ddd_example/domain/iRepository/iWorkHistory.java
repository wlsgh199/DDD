package com.example.ddd_example.domain.iRepository;

import com.example.ddd_example.domain.model.mWorkHistory;

import java.sql.SQLException;
import java.util.List;

public interface iWorkHistory {

    List<mWorkHistory.Get_WorkHistory_Response> Get(mWorkHistory.Get_WorkHistory_Request get_request) throws SQLException;

    String Add(mWorkHistory.Add_WorkHistory_Request add_request ) throws  SQLException;

}
