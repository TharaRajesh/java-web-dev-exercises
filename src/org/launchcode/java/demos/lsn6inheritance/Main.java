package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {



        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());   // prints true
        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());   // prints 13
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        System.out.println(cheshireCat.noise()); // prints "Hello, my name is Cheshire!"
        Cat suki = new HouseCat("Suki", 8);
        System.out.println(suki.noise());
        System.out.println(((HouseCat) suki).isSatisfied());


    }
}