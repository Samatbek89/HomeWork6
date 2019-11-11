
package com.company;

public class Boss extends Player {
    private String lifeType;



    public Boss(int health, String damage, String lifeType) {
        super(health, damage);
        this.lifeType = lifeType;
    }

    public String getLifeType() {
        return lifeType;
    }

    public void setLifeType(String lifeType) {
        this.lifeType = lifeType;
    }

    @Override
    public void makeSay() {
        System.out.println("I'm Boss");
    }
}
