package com.epam.mjc.stage0;

public class Bird extends Animal {

    private String color;

    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color="blue", numberOfPaws=2, hasFur=false);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
