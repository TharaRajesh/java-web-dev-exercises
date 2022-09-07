package org.launchcode.java.exercises.technology;

public class Main {
    public static void main(String[] args) {

        Laptop dell = new Laptop(150,12,"dell", 75);
        System.out.println(dell.getBatteryStatus());
        System.out.println(dell.getId());


        SmartPhone samsung = new SmartPhone(112,80,"dell", 10);
        System.out.println(samsung.takePhoto(50));
        System.out.println(samsung.getId());

//
    }

}