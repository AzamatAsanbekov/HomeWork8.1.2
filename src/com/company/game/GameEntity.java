package com.company.game;



public abstract class GameEntity {
    private int health;
    private int damage;

    public GameEntity(int health, int damage) {
        this.setHealth(health);
        this.setDamage(damage);
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
