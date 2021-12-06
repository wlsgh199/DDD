package com.example.ddd_example.domain.iRepository;


import com.example.ddd_example.domain.model.mAccount;

import java.sql.SQLException;
import java.util.List;

public interface iAccount {

    mAccount.Account_Get_Response Get(mAccount.Account_Get_Request model) throws SQLException;
    List<mAccount.Account_Get_Response> GetAll() throws SQLException;

    String Add(mAccount.Account_Add_Request modelO) throws SQLException;

}
