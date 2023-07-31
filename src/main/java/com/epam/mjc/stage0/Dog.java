package com.epam.mjc.stage0;

public class Dog extends Animal {

    public Dog(String color, int numberOfPaws, boolean hasFur) {
        super(color="brown", numberOfPaws=4, hasFur=true);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
    Dog dog=new Dog("brown",4,true);

}

