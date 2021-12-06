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

}
