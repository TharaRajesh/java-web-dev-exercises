package org.launchcode.java.exercises.technology;

public class Computer extends AbstractEntity{
    private int memory;
    private int storage;

    private String processorName;

    public Computer(int memory, int storage, String processorName){
        super.setId();
        this.memory = memory;
        this.storage = storage;
        this.processorName = processorName;
    }
    public int getStorage(){
        return this.storage;
    }
    public int getMemory(){
        return this.memory;
    }
    public String getProcessorName(){
        return this.processorName;
    }
    public void addMemory (int n) {
        this.memory = this.memory + n;
    }

    public void addStorage(int x) {
        this.storage = this.storage + x;
    }



}
