package com.example.ddd_example.domain.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


public class mWorkHistory {

    @ApiModel
    public static class Add_WorkHistory_Request{
        @ApiModelProperty(example = "20210001")
        private String id;
        @ApiModelProperty(example = "박진호")
        private String name;
        @ApiModelProperty(example = "101")
        private int deparment_code;
        @ApiModelProperty(example = "솔루션 개발부")
        private String deparment_name;
        @ApiModelProperty(example = "2021-12-03 09:00:00")
        private String start_time;
        @ApiModelProperty(example = "2021-12-03 18:00:00")
        private String end_time;
        @ApiModelProperty(example = "8")
        private String work_time;
        @ApiModelProperty(example = "특이사항 없음.")
        private String message;
        @ApiModelProperty(example = "201")
        private int work_type_code;
        @ApiModelProperty(example = "정상근무")
        private String work_type_name;

        public Add_WorkHistory_Request(String id, String name, int deparment_code, String deparment_name, String start_time, String end_time, String work_time, String message, int work_type_code, String work_type_name) {
            this.id = id;
            this.name = name;
            this.deparment_code = deparment_code;
            this.deparment_name = deparment_name;
            this.start_time = start_time;
            this.end_time = end_time;
            this.work_time = work_time;
            this.message = message;
            this.work_type_code = work_type_code;
            this.work_type_name = work_type_name;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getDeparment_code() {
            return deparment_code;
        }

        public String getDeparment_name() {
            return deparment_name;
        }

        public String getStart_time() {
            return start_time;
        }

        public String getEnd_time() {
            return end_time;
        }

        public String getWork_time() {
            return work_time;
        }

        public String getMessage() {
            return message;
        }

        public int getWork_type_code() {
            return work_type_code;
        }

        public String getWork_type_name() {
            return work_type_name;
        }
    }

    @ApiModel
    public static class Get_WorkHistory_Request{
        private String id;
        private String start_time;
        private String end_time;

        public Get_WorkHistory_Request(String id, String start_time, String end_time)
        {
            this.id = id;
            this.start_time = start_time;
            this.end_time = end_time;
        }

        public String getId()
        {
            return this.id;
        }
        public String getStart_Time()
        {
            return this.start_time;
        }
        public String getEnd_Time()
        {
            return this.end_time;
        }
    }

    @ApiModel
    public static class Get_WorkHistory_Response{

        @ApiModelProperty(example = "20210001")
        private String id;
        @ApiModelProperty(example = "박진호")
        private String name;
        @ApiModelProperty(example = "101")
        private int deparment_code;
        @ApiModelProperty(example = "솔루션 개발부")
        private String deparment_name;
        @ApiModelProperty(example = "2021-12-03 09:00:00")
        private String start_time;
        @ApiModelProperty(example = "2021-12-03 18:00:00")
        private String end_time;
        @ApiModelProperty(example = "8")
        private String work_time;
        @ApiModelProperty(example = "특이사항 없음.")
        private String message;
        @ApiModelProperty(example = "201")
        private int work_type_code;
        @ApiModelProperty(example = "정상근무")
        private String work_type_name;

        public Get_WorkHistory_Response(String id, String name, int deparment_code, String deparment_name, String start_time, String end_time, String work_time, String message, int work_type_code, String work_type_name) {
            this.id = id;
            this.name = name;
            this.deparment_code = deparment_code;
            this.deparment_name = deparment_name;
            this.start_time = start_time;
            this.end_time = end_time;
            this.work_time = work_time;
            this.message = message;
            this.work_type_code = work_type_code;
            this.work_type_name = work_type_name;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getDeparment_code() {
            return deparment_code;
        }

        public String getDeparment_name() {
            return deparment_name;
        }

        public String getStart_time() {
            return start_time;
        }

        public String getEnd_time() {
            return end_time;
        }

        public String getWork_time() {
            return work_time;
        }

        public String getMessage() {
            return message;
        }

        public int getWork_type_code() {
            return work_type_code;
        }

        public String getWork_type_name() {
            return work_type_name;
        }
    }

    public static class Update{

    }

    public static class Delete{

    }



}
