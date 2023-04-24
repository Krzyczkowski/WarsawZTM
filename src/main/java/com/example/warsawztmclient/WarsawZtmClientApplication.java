package com.example.warsawztmclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class WarsawZtmClientApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(WarsawZtmClientApplication.class, args);
        staticDataLoader.loadDataFromJsonFile("E:\\WarsawZTM-Client\\src\\main\\resources\\static\\ztmWarszawa.json");
        System.out.println("done");
    }
   // InputStream inputStream = getResourceAsStream("static/ztmWarszawa.txt");


}
