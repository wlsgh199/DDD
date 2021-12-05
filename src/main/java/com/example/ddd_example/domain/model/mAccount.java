package com.example.ddd_example.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.Date;

public class mAccount {

    @Getter
    @AllArgsConstructor
    public static class Add_Request{
        @ApiModelProperty(example = "wlsgh199")
        private  String id;
        @JsonIgnore
        @ApiModelProperty(example = "SHA-256")
        private String password;
        @ApiModelProperty(example = "박진호")
        private String name;
        @ApiModelProperty(example = "wlsgh950221@gmail.com")
        private String email;
        @ApiModelProperty(example = "010-7556-4926")
        private String phone_number;
        @ApiModelProperty(example = "2021-12-01")
        private Date hire_date;
    }

    public static class Add_Response{

        @ApiModelProperty(example = "status")
        private HttpStatus status;

        @ApiModelProperty(example = "Account Add OK")
        private String message;

        public Add_Response(HttpStatus status, String message) {
            this.status = status;
            this.message = message;
        }
    }

    public static class Get_Request{
        @ApiModelProperty(example = "wlsgh199")
        private  String id;
    }

    public static class Get_Response
    {
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
        private Date hire_date;

        public Get_Response(String id, String password, String name, String email, String phone_number, Date hire_date) {
            this.id = id;
            this.password = password;
            this.name = name;
            this.email = email;
            this.phone_number = phone_number;
            this.hire_date = hire_date;
        }
    }

    public static class Update{

    }

    public static class Delete{

    }

}
