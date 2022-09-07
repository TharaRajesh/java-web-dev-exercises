package org.launchcode.java.exercises.technology;

public class SmartPhone extends Computer {

    private int numberOfPic;

    public SmartPhone(int memory, int storage, String processorName,int numberOfPic) {
        super(memory,storage,processorName);
        this.numberOfPic =numberOfPic;
    }

    public String takePhoto(int noOfPics) {
        if(numberOfPic + noOfPics > super.getStorage()){
            return "Your Storage is full can't take Picture";
        }else{
            this.numberOfPic = this.numberOfPic + noOfPics;
            return noOfPics + " pictures are taken. Enjoy your photos.";
        }
    }
    public String clearPhoto(){
        this.numberOfPic = 0;
        return "All pictures are deleted.";
    }
    public int getNumberOfPic(){
        return this.numberOfPic;
    }


}
