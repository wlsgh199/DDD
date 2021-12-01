package com.example.ddd_example.config;

import java.sql.*;

public class DataBase {

    private final String username;
    private final String userpass;
    private final String database_url;

    private static volatile DataBase instance = null;

    private DataBase() throws Exception {
        ReadProperties readProperties = new ReadProperties();
        var property = readProperties.ReadProperties("application.properties");
        this.username = property.getProperty("database.username");
        this.userpass = property.getProperty("database.userpass");
        this.database_url = property.getProperty("database.url");
        String database_driver = property.getProperty("database.driver-class-name");

        try {
            Class.forName(database_driver);
        } catch (Exception e) {
            throw new Exception("Failed to create JDBC drivers.", e);
        }
    }

    public static DataBase getInstance() throws Exception {
        if (instance == null) {
            //data의 thread-safe
            synchronized (DataBase.class) {
                if (instance == null) {
                    instance = new DataBase();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.database_url,this.username,this.userpass);
    }

    //example
//finally {
//        if (con != null) {
//            try {
//                // 컨넥션은 익셉션이 발생하더라도 항상 close() 될수 있도록 finally 에서 처리한다
//                con.close();
//            } catch (SQLException e) {
//                // 컨넥션을 닫을때 생기는 문제는 무시한다
//            }
//        }
//    }



//    public Connection getConnection() {
//        try
//        {
//            Class.forName(this.database_driver);
//        }
//        catch (ClassNotFoundException e)
//        {
//            e.printStackTrace();
//            return null;
//        }
//        try
//        {
//            con = DriverManager.getConnection(this.database_url,this.username,this.userpass);
//            return con;
//        }
//        catch (SQLException e)
//        {
//            e.printStackTrace();
//            return null;
//        }
//    }

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
//
//    void printcust() {
//        System.out.println(custid+"\t\t"+name+"\t\t\t"+address+"\t\t\t"+phone);
//    }


}
