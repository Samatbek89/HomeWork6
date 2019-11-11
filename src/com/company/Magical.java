package com.company;

public class Magical extends Player {

    String origin;

    public Magical(int health, String damage, String origin) {
        super(health, damage);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public void makeSay() {
        System.out.println("magic man");
    }
}