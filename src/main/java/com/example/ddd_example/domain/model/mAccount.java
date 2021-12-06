package com.example.ddd_example.domain.model;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.http.HttpStatus;

public class mAccount {

    public static class  Account_Add_Request{
        @ApiModelProperty(example = "wlsgh199")
        private final String id;
        @ApiModelProperty(example = "SHA-256")
        private final String password;
        @ApiModelProperty(example = "박진호")
        private final String name;
        @ApiModelProperty(example = "wlsgh950221@gmail.com")
        private final String email;
        @ApiModelProperty(example = "010-7556-4926")
        private final String phone_number;
        @ApiModelProperty(example = "2021-12-01")
        private final String hire_date;

        public  Account_Add_Request(String id, String password, String name, String email, String phone_number, String hire_date) {
            this.id = id;
            this.password = password;
            this.name = name;
            this.email = email;
            this.phone_number = phone_number;
            this.hire_date = hire_date;
        }

        public String getId() {
            return id;
        }

        public String getPassword() {
            return password;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone_number() {
            return phone_number;
        }

        public String getHire_date() {
            return hire_date;
        }
    }


    public static class  Account_Get_Request{
        @ApiModelProperty(example = "wlsgh199")
        private final String id;

        public Account_Get_Request(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }

    public static class Account_Get_Response
    {
        @ApiModelProperty(example = "wlsgh199")
        private final String id;
        @ApiModelProperty(example = "박진호")
        private final String name;
        @ApiModelProperty(example = "wlsgh950221@gmail.com")
        private final String email;
        @ApiModelProperty(example = "010-7556-4926")
        private final String phone_number;
        @ApiModelProperty(example = "2021-12-01")
        private final String hire_date;

        public Account_Get_Response(String id, String name, String email, String phone_number, String hire_date) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.phone_number = phone_number;
            this.hire_date = hire_date;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone_number() {
            return phone_number;
        }

        public String getHire_date() {
            return hire_date;
        }
    }

    public static class Account_Put_Request{
        @ApiModelProperty(example = "wlsgh199")
        private final String id;
        @ApiModelProperty(example = "SHA-256")
        private final String password;
        @ApiModelProperty(example = "박진호")
        private final String name;
        @ApiModelProperty(example = "wlsgh950221@gmail.com")
        private final String email;
        @ApiModelProperty(example = "010-7556-4926")
        private final String phone_number;

        public Account_Put_Request(String id, String password, String name, String email, String phone_number) {
            this.id = id;
            this.password = password;
            this.name = name;
            this.email = email;
            this.phone_number = phone_number;
        }

        public String getId() {
            return id;
        }

        public String getPassword() {
            return password;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone_number() {
            return phone_number;
        }
    }

    public static class Account_Delete_Request{

        @ApiModelProperty(example = "wlsgh199")
        private  String id;

        public Account_Delete_Request(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }





}
