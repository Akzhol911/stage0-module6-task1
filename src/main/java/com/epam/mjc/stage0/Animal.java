package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;


    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public void getDescription() {
        String fur = " ";
        if (hasFur = true){
            fur = "a";
        }else {
            fur = "no";
        }

        System.out.println("This animal is mostly " + color+". " + "It has " + numberOfPaws + " paws  and " +
                fur+ " fur.");
    }
}
