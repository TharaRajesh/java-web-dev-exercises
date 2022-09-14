package org.launchcode.java.demos.lsn6inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }
    public HouseCat(String aName) {
        name = aName;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }



    public String purr() {
        return "I'm a HouseCat";
    }


    public String noise() {
        return "Hello, my name is " + name + "!";
    }

}
