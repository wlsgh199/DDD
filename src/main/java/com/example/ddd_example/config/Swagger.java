package com.example.ddd_example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class Swagger {

    private String version;
    private String title;

    @Bean
    public Docket Swagger() {
        this.version = "v1.0";
        this.title = "Spring DDD example";


        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .groupName(version)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.ddd_example"))
                .apis(RequestHandlerSelectors.any())
                //.paths(PathSelectors.ant("api/v1.0/workhistory"))
                .build()
                .apiInfo(apiInfo(title, version));
    }


    private ApiInfo apiInfo(String title, String version) {
        return new ApiInfo(
                title,
                "Swagger로 생성한 API Docs",
                version,
                "www.example.com",
                new Contact("Contact us", "www.example.com", "wlsgh950221@gmail.com"),
                "Licenses",
                "www.example.com",
                new ArrayList<>());
    }


}
