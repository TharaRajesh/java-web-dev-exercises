package org.launchcode.java.exercises.technology;

public class Laptop extends Computer {
    private int batteryPercentage;

    public Laptop(int memory, int storage, String processorName, int batteryPercentage) {
        super(memory,storage,processorName);
        this.batteryPercentage = batteryPercentage;
    }
    public String playMovie(int noOfMins) {
        if (noOfMins < this.batteryPercentage) {
            this.batteryPercentage = this.batteryPercentage - noOfMins;
            return "Your movie is playing.";
        } else {
            return "Movie can't play. Charge your battery.";
        }
    }
    public String getBatteryStatus(){
        if (this.batteryPercentage == 100){
            return "Battery is full";
        }
        else {
            return "Battery percentage is " + this.batteryPercentage + " Charge your battery";
        }
    }
    public void chargeBattery(int noOfMins){
        if(this.batteryPercentage+noOfMins > 100) {
            this.batteryPercentage =100;
        } else {
            this.batteryPercentage +=noOfMins;
        }
    }

}
