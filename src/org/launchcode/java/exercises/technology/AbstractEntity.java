package org.launchcode.java.exercises.technology;

import java.util.Random;
import java.util.UUID;

public abstract class AbstractEntity {
    private String id;

    public String getId(){
        return this.id;
    }
    public void setId(){
        this.id = UUID.randomUUID().toString();
    }

}
