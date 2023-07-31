package com.epam.mjc.stage0;

public class Bird extends Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color="blue", numberOfPaws=2, hasFur=false);
    }

    @Override
    public String getDescription() {
        return   ("This animal is mostly " + this.color+". " + "It has " + this.numberOfPaws + (this.numberOfPaws==1?" paw":" paws") +  " and " +
                (hasFur?"a":"no") + " fur. Moreover, it has 2 wings and can fly.");
    }
    Bird bird=new Bird("blue",2,false);
}
