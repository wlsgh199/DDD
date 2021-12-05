package com.example.ddd_example.infrastructure;


import com.example.ddd_example.domain.iRepository.iAccount;
import com.example.ddd_example.domain.model.mAccount;

import java.sql.SQLException;

public class Account implements iAccount {

    public mAccount.Get_Response Get(mAccount.Get_Request dto) throws SQLException {

        return null;
    }

}
