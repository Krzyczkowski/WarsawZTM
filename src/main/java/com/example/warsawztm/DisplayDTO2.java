package com.example.warsawztm;
// ogólna klasa na displays
public class DisplayDTO2 {
    public String displayCode;
    public String orginalName;
    public String name;
    public String type;
    public String drivingDirection;
    public String idStop1;
    public String idStop2;
    public String idStop3;
    public String idStop4;


    public DisplayDTO2(WarsawDisplay warsawDisplay){
        setDisplayCode(warsawDisplay.zespol);
        setName(warsawDisplay.getNazwa_zespolu());
        setOrginalName(warsawDisplay.getNazwa_zespolu());
        setType("?");
        setDrivingDirection(warsawDisplay.getKierunek());
        setIdStop1(warsawDisplay.getSlupek());
        setIdStop2("0");
        setIdStop3("0");
        setIdStop4("0");
    }

    public void setNextIdStop(DisplayDTO2 displayDTO){
        String checkedNewIdStop = displayDTO.getIdStop1();
        if(!getIdStop1().equals(checkedNewIdStop) && !getIdStop2().equals(checkedNewIdStop) && !getIdStop3().equals(checkedNewIdStop) && !getIdStop4().equals(checkedNewIdStop)) {
            if (getIdStop1() == "0") setIdStop1(checkedNewIdStop);
            else if (getIdStop2() == "0") setIdStop2(checkedNewIdStop);
            else if (getIdStop3() == "0") setIdStop3(checkedNewIdStop);
            else if (getIdStop4() == "0") setIdStop4(checkedNewIdStop);
        }
    }

    public String getDisplayCode() {
        return displayCode;
    }

    public void setDisplayCode(String displayCode) {
        this.displayCode = displayCode;
    }

    public String getOrginalName() {
        return orginalName;
    }

    public void setOrginalName(String orginalName) {
        this.orginalName = orginalName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDrivingDirection() {
        return drivingDirection;
    }

    public void setDrivingDirection(String drivingDirection) {
        this.drivingDirection = drivingDirection;
    }

    public String getIdStop1() {
        return idStop1;
    }

    public void setIdStop1(String idStop1) {
        this.idStop1 = idStop1;
    }

    public String getIdStop2() {
        return idStop2;
    }

    public void setIdStop2(String idStop2) {
        this.idStop2 = idStop2;
    }

    public String getIdStop3() {
        return idStop3;
    }

    public void setIdStop3(String idStop3) {
        this.idStop3 = idStop3;
    }

    public String getIdStop4() {
        return idStop4;
    }

    public void setIdStop4(String idStop4) {
        this.idStop4 = idStop4;
    }

    @Override
    public String toString() {
        return "displayCode='" + displayCode + '\'' +
                ", orginalName='" + orginalName + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", drivingDirection='" + drivingDirection + '\'' +
                ", idStop1='" + idStop1 + '\'' +
                ", idStop2='" + idStop2 + '\'' +
                ", idStop3='" + idStop3 + '\'' +
                ", idStop4='" + idStop4 + '\'';
    }
}
