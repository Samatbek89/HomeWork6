package com.company;

public abstract class Player {
    private int level;
    private String healthType;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getHealthType() {
        return healthType;
    }

    public void setHealthType(String healthType) {
        this.healthType = healthType;
    }

    public Player(int health, String healthType) {
        this.level = health;
        this.healthType = healthType;

    }
    public abstract void makeSay();
}