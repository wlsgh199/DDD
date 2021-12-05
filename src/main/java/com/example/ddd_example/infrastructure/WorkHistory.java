package com.example.ddd_example.infrastructure;

import com.example.ddd_example.config.DataBase;
import com.example.ddd_example.domain.iRepository.iWorkHistory;
import com.example.ddd_example.domain.model.mWorkHistory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WorkHistory implements iWorkHistory {

    public List<mWorkHistory.Get_Response> Get(mWorkHistory.Get_Request model) throws SQLException {
        String sql = "select * FROM work_history "
                    + "where id = ?"
                    + "  and start_time <= ?"
                    + "  and end_time >= ?";

        Connection con = null;
        ArrayList<mWorkHistory.Get_Response> modellist = new ArrayList<>();
        try {
            con = DataBase.getInstance().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            int i = 0;
            st.setString(++i, model.getId());
            st.setString(++i, model.getStart_Time());
            st.setString(++i, model.getEnd_Time());

            ResultSet rs = st.executeQuery();

            while(rs.next())
            {
                modellist.add(
                        new mWorkHistory.Get_Response(
                                rs.getString("id"),
                                rs.getString("name"),
                                rs.getInt("deparment_code"),
                                rs.getString("deparment_name"),
                                rs.getString("start_time"),
                                rs.getString("end_time"),
                                rs.getString("work_time"),
                                rs.getString("message"),
                                rs.getInt("work_type_code"),
                                rs.getString("work_type_name"))
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
        return modellist;
    }

    public String Add(mWorkHistory.Add_Request model) throws SQLException {

        String sql = "insert into work_history (id, name,deparment_code, deparment_name , start_time, end_time, work_time, message, work_type_code, work_type_name) "
                + "values(?,?,?,?,?,?,?,?,?,?)";

        Connection con = null;
        try {
            con = DataBase.getInstance().getConnection();
            PreparedStatement st = con.prepareStatement(sql);
            int i = 0;
            st.setString(++i, model.getId());
            st.setString(++i, model.getName());
            st.setInt(++i, model.getDeparment_code());
            st.setString(++i, model.getDeparment_name());
            st.setString(++i, model.getStart_time());
            st.setString(++i, model.getEnd_time());
            st.setString(++i, model.getWork_time());
            st.setString(++i, model.getMessage());
            st.setInt(++i, model.getWork_type_code());
            st.setString(++i, model.getWork_type_name());

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

        return "WorkHistory Add Success";
    }
}