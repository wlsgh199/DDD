package com.example.ddd_example.domain.iRepository;


import com.example.ddd_example.domain.model.mAccount;

import java.sql.SQLException;

public interface iAccount {

    mAccount.Get_Response Get(mAccount.Get_Request model) throws SQLException;


}
