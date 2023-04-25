package com.example.warsawztm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;

@SpringBootApplication
public class WarsawZtmClientApplication {
    public static ArrayList<WarsawDisplay> displayList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        SpringApplication.run(WarsawZtmClientApplication.class, args);
        displayList = com.example.warsawztm.staticDataLoader.loadDataFromJsonFile("E:\\WarsawZTM\\src\\main\\resources\\static\\ztmWarszawa.json");
        if(!displayList.isEmpty()){
            displayList.forEach(e->{
                System.out.println(e);
            });
        }
        else{
            System.out.println("displayList is empty!");
        }
    }
   // InputStream inputStream = getResourceAsStream("static/ztmWarszawa.txt");


}
