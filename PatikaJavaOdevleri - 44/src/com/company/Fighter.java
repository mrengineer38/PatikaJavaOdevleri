package com.company;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
        if(foe.isFighterStart()) {
            System.out.println(this.name + " => " + foe.name + " " + this.damage + " ek saldırı yaptı.");
            return (int) (foe.health - (2)*this.damage);
        }
        if(foe.isDodge()){
            System.out.println(foe.name+ " Gelen Hasarı Blokladı.");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }
    boolean isDodge() {
        double randomNumber = Math.random()*100;
        return randomNumber <= this.dodge;

    }
    boolean isFighterStart() {
        double randomNum = Math.random() * 100;
        if (randomNum >= 95) {
            return true;
        }
        return false;
    }

}
