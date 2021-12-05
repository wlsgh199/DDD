package com.example.ddd_example.domain.iRepository;


import com.example.ddd_example.domain.model.mAccount;

import java.sql.SQLException;
import java.util.List;

public interface iAccount {

    mAccount.Get_Account_Response Get(mAccount.Get_Account_Request model) throws SQLException;
    List<mAccount.Get_Account_Response> GetAll() throws SQLException;

    String Add(mAccount.Add_Account_Request modelO) throws SQLException;

}
