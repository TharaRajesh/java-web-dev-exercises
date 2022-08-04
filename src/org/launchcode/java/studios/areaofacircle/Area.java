package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
//      //  Area of a circle
        double areaOfCircle =  StudioAreaOfCircle.getArea(radius);
        while(radius < 0 ){
            System.out.println("Please enter a valid Number!");
            double rad= input.nextDouble();
            return rad;
        }
        System.out.println("The area of a circle of radius "+ radius + " is : " + areaOfCircle);
    }
}


