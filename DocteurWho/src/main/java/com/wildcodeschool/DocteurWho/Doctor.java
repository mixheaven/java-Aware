package com.wildcodeschool.DocteurWho;

public class Doctor {
    public static int position= 0;
    private int number;
    private String name;
    public Doctor(String name){
        this.name = name;
        this.number = position++;
    }
    public static int getPosition() {
        return position;
    }

    public static void setPosition(int position) {
        Doctor.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name+"a";
    }


}


