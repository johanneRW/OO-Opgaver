package company;

import java.util.Random;

public class Dice {
    private int faceValue;

    public Dice (int faceValue){
        this.faceValue=faceValue;
    }


    public void rollDice(){
        Random rand = new Random();
        faceValue= rand.nextInt(5)+1;
    }
    public int getFaceValue() {
        return faceValue;
    }

    @Override
    public String toString() {
        return "faceValue:" + faceValue;
    }
}
