package com.example.ddd_example.config;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.nio.charset.Charset;

public class HttpHeader {
    public static HttpHeaders Default()
    {
        HttpHeaders headers= new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
        return  headers;
    }

}
