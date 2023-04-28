package com.example.warsawztm;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import static java.lang.Integer.parseInt;

@Getter
@Setter
@Document(collection = "displays")
public class DisplayDTO {


    private int displayCode;

    private String originalName;
    private String name;
    private String type;
    private String drivingDirection;

    private int idStop1;
    private int idStop2;
    private int idStop3;
    private int idStop4;



    @Override
    public String toString() {
        return "DisplayDTO{" +
                "displayCode=" + displayCode +
                ", originalName='" + originalName + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", drivingDirection='" + drivingDirection + '\'' +
                ", idStop1=" + idStop1 +
                ", idStop2=" + idStop2 +
                ", idStop3=" + idStop3 +
                ", idStop4=" + idStop4 +
                '}';
    }

    //WARSAW
    public DisplayDTO(WarsawDisplay warsawDisplay){
        setDisplayCode(0);
        setName(warsawDisplay.getNazwa_zespolu());
        setOriginalName(warsawDisplay.getNazwa_zespolu());
        setType("?");
        setDrivingDirection(warsawDisplay.getKierunek());
        setIdStop1(parseInt(warsawDisplay.getSlupek()));
        setIdStop2(0);
        setIdStop3(0);
        setIdStop4(0);
    }

    public void setNextIdStop(DisplayDTO displayDTO){
        int checkedNewIdStop = displayDTO.getIdStop1();
        if(getIdStop1()!=checkedNewIdStop
                && getIdStop2()!=checkedNewIdStop
                && getIdStop3()!=checkedNewIdStop
            && getIdStop4()!=checkedNewIdStop) {
            if (getIdStop1() == 0) setIdStop1(checkedNewIdStop);
            else if (getIdStop2() == 0) setIdStop2(checkedNewIdStop);
            else if (getIdStop3() == 0) setIdStop3(checkedNewIdStop);
            else if (getIdStop4() == 0) setIdStop4(checkedNewIdStop);
        }
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public void setIdStop1(int idStop1) {
        this.idStop1 = idStop1;
    }

    public void setIdStop2(int idStop2) {
        this.idStop2 = idStop2;
    }

    public void setIdStop3(int idStop3) {
        this.idStop3 = idStop3;
    }

    public void setIdStop4(int idStop4) {
        this.idStop4 = idStop4;
    }

    public void setDisplayCode(int displayCode) {
        this.displayCode = displayCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDrivingDirection(String drivingDirection) {
        this.drivingDirection = drivingDirection;
    }

    public int getDisplayCode() {
        return displayCode;
    }

    public String getOriginalName() {
        return originalName;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDrivingDirection() {
        return drivingDirection;
    }

    public int getIdStop1() {
        return idStop1;
    }

    public int getIdStop2() {
        return idStop2;
    }

    public int getIdStop3() {
        return idStop3;
    }

    public int getIdStop4() {
        return idStop4;
    }
}