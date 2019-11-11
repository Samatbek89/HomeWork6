package com.company;

public class Warrior extends Player {
    private int amountDefence;


    public Warrior(int health, String damage, int amountDefence) {
        super(health, damage);
        this.amountDefence = amountDefence;
    }

    public int getAmountDefence() {
        return amountDefence;
    }

    public void setAmountDefence(int amountDefence) {
        this.amountDefence = amountDefence;
    }

    @Override
    public void makeSay() {
        System.out.println("I'm Warrior");
    }
}