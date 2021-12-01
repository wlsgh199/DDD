package com.example.ddd_example.infrastructure;

import com.example.ddd_example.config.DataBase;
import com.example.ddd_example.domain.iRepository.iworkhistory;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


public class workhistory implements iworkhistory {

    private  iworkhistory iworkhistory;
    public Boolean InsertWorkHistory()
    {
        return true;
    }

    public List<com.example.ddd_example.domain.dto.workhistoryDTO> GetWorkHistoryList(int user_code, String start_date, String end_date) throws SQLException
    {
        String sql = "insert into work_history(id, name)"
                + "values(?,?)";

        Connection con = null;
        try {
            con = DataBase.getInstance().getConnection();
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, "test1");
            st.setString(2, "test2");
//            st.setString(3, user.getNickname());
//            st.setString(4, birth);
//            st.setString(5, user.getEmail());
//            st.setInt(6, user.getAuthokey());

            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    // 컨넥션은 익셉션이 발생하더라도 항상 close() 될수 있도록 finally 에서 처리한다
                    con.close();
                } catch (SQLException e) {
                    // 컨넥션을 닫을때 생기는 문제는 무시한다
                }
            }
        }
        return null;
    }

    //    void printCustomer()
//    {
//        String query = "SELECT * FROM work_history";
//        try
//        {
//            stmt = con.createStatement(); //2
//            rs = stmt.executeQuery(query); //3
//            System.out.println("CUSTID \tNAME \tADDRESS \tPHONE");
//
//            int i=0;
//            while (rs.next ())
//            {
//                custid=rs.getInt(1);
//                name=rs.getString(2);
//                address=rs.getString("id");
//                phone=rs.getString(4);
//                printcust();
//
//            }
//            con.close();
//        }
//        catch (SQLException e)
//        {
//            e.printStackTrace();
//        }
//    }

}
