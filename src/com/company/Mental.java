package com.company;

public class Mental extends Player {
    private int abilities;

    public Mental(int health, String damage, int abilities) {
        super(health, damage);
        this.abilities = abilities;
    }

    public int getAbilities() {
        return abilities;
    }

    public void setAbilities(int abilities) {
        this.abilities = abilities;
    }

    @Override
    public void makeSay() {
        System.out.println("UUUUUU");
    }
}