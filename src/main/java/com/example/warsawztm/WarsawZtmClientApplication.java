package com.example.warsawztm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;

@SpringBootApplication
public class WarsawZtmClientApplication {
    public static ArrayList<WarsawDisplay> displayList = new ArrayList<>();
    public static ArrayList<DisplayDTO> displayDTOS = new ArrayList<>();
    public static DisplayDTOArrayList displayDTOArrayList;
    public static void main(String[] args) throws IOException {
        SpringApplication.run(WarsawZtmClientApplication.class, args);
        displayList = com.example.warsawztm.staticDataLoader.loadDataFromJsonFile(".\\src\\main\\resources\\static\\ztmWarszawa.json");
        if(!displayList.isEmpty()){
            displayList.forEach(e->{
                DisplayDTO displayDTO = new DisplayDTO(e);
                displayDTOS.add(displayDTO);
            });
            displayDTOArrayList = new DisplayDTOArrayList(displayDTOS);
            for (int i = 0; i < displayDTOArrayList.length(); i++) {
                System.out.println(displayDTOArrayList.displayDTOS.get(i));
            }



        }
        else{
            System.out.println("displayList is empty!");
        }
    }
   // InputStream inputStream = getResourceAsStream("static/ztmWarszawa.txt");


}
