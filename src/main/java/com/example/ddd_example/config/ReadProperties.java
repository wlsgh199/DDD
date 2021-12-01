package com.example.ddd_example.config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
    public Properties ReadProperties(String propFileName) {
        Properties prop = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

        try {
            if (inputStream != null) {
                prop.load(inputStream);
                return prop;
            } else {
                throw new FileNotFoundException("프로퍼티 파일 '" + propFileName + "'을 resource에서 찾을 수 없습니다.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
