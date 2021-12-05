package com.example.ddd_example.infrastructure;


import com.example.ddd_example.config.DataBase;
import com.example.ddd_example.domain.iRepository.iAccount;
import com.example.ddd_example.domain.model.mAccount;
import org.springframework.http.HttpStatus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Account implements iAccount {

    public mAccount.Get_Account_Response Get(mAccount.Get_Account_Request model) throws SQLException {

        String sql = "select id, name, email, phone_number, hire_date FROM account "
                + "where id = ?";

        Connection con = null;
        mAccount.Get_Account_Response resultModel = null;
        try {
            con = DataBase.getInstance().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            int i = 0;
            st.setString(++i, model.getId());

            ResultSet rs = st.executeQuery();

            while(rs.next())
            {
                resultModel = new mAccount.Get_Account_Response(
                                rs.getString("id"),
                                rs.getString("name"),
                                rs.getString("email"),
                                rs.getString("phone_number"),
                                rs.getString("hire_date"));
            }

            rs.close();
            st.close();
        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    // 컨넥션을 닫을때 생기는 문제는 무시한다
                }
            }
        }
        return resultModel;
    }

    public List<mAccount.Get_Account_Response> GetAll() throws SQLException {

        String sql = "select id, name, email, phone_number, hire_date FROM account "
                + "where id = ? limit 100";

        Connection con = null;
        ArrayList<mAccount.Get_Account_Response> resultmAccountList = new ArrayList<>();
        try {
            con = DataBase.getInstance().getConnection();
            PreparedStatement st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                resultmAccountList.add(
                        new mAccount.Get_Account_Response(
                                rs.getString("id"),
                                rs.getString("name"),
                                rs.getString("email"),
                                rs.getString("phone_number"),
                                rs.getString("hire_date"))
                );
            }

            rs.close();
            st.close();
        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    // 컨넥션을 닫을때 생기는 문제는 무시한다
                }
            }
        }
        return resultmAccountList;
    }
    public String Add(mAccount.Add_Account_Request model) throws SQLException{
        String sql = "insert into account (id, password , name,email, phone_number , hire_date) "
                + "values(?,?,?,?,?,?)";

        Connection con = null;
        try {
            con = DataBase.getInstance().getConnection();

            PreparedStatement st = con.prepareStatement(sql);
            int i = 0;
            st.setString(++i, model.getId());
            st.setString(++i, model.getPassword());
            st.setString(++i, model.getName() );
            st.setString(++i, model.getEmail());
            st.setString(++i, model.getPhone_number());
            st.setString(++i, model.getHire_date());

            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    // 컨넥션을 닫을때 생기는 문제는 무시한다
                }
            }
        }
        return  "Account Add OK";
    }
}
