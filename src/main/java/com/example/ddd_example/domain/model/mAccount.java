package com.example.ddd_example.domain.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.http.HttpStatus;

public class mAccount {

    @ApiModel
    public static class Add_Account_Request{
        @ApiModelProperty(example = "wlsgh199")
        private  String id;
        @ApiModelProperty(example = "SHA-256")
        private String password;
        @ApiModelProperty(example = "박진호")
        private String name;
        @ApiModelProperty(example = "wlsgh950221@gmail.com")
        private String email;
        @ApiModelProperty(example = "010-7556-4926")
        private String phone_number;
        @ApiModelProperty(example = "2021-12-01")
        private String hire_date;

        public Add_Account_Request(String id, String password, String name, String email, String phone_number, String hire_date) {
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
    @ApiModel
    public static class Add_Account_Response{

        @ApiModelProperty(example = "status")
        private HttpStatus status;

        @ApiModelProperty(example = "Account Add OK")
        private String message;

        public Add_Account_Response(HttpStatus status, String message) {
            this.status = status;
            this.message = message;
        }
    }
    @ApiModel
    public static class Get_Account_Request{
        @ApiModelProperty(example = "wlsgh199")
        private  String id;

        public Get_Account_Request(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }
    }
    @ApiModel
    public static class Get_Account_Response
    {
        @ApiModelProperty(example = "wlsgh199")
        private  String id;
        @ApiModelProperty(example = "박진호")
        private String name;
        @ApiModelProperty(example = "wlsgh950221@gmail.com")
        private String email;
        @ApiModelProperty(example = "010-7556-4926")
        private String phone_number;
        @ApiModelProperty(example = "2021-12-01")
        private String hire_date;

        public Get_Account_Response(String id, String name, String email, String phone_number, String hire_date) {
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

    public static class Update{

    }

    public static class Delete{

    }

}
