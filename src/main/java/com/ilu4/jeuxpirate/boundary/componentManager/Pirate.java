/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ilu4.jeuxpirate.boundary.componentManager;

/**
 *
 * @author vince
 */
public class Pirate {
    
    private String name;
    private int healthPoints;
    private int popularity;
    //private MainJoueur main;
    
    
    public Pirate(String name) {
        this.name = name;
        this.healthPoints = 5;
        this.popularity = 0;
        //this.main = new MainJoueur();
    }
    
    public Pirate getPirate() {
        return this;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
    
    public int getPopularity() {
        return popularity;
    }
    
    public void addHealthPoints(int hp) {
        int newHp = healthPoints += hp;
        
        if (newHp >= 5) {
            this.healthPoints = 5;
        } else {
            this.healthPoints = newHp;
        }
    }
    
    public void removeHealthPoints(int hp) {
        int newHp = healthPoints -= hp;
        
        if (newHp <= 0) {
            this.healthPoints = 0;
        } else {
            this.healthPoints = newHp;
        }
    }
    
    public void addPopularity(int pop) {
        int newPop = popularity += pop;
        
        if (newPop >= 5) {
            this.popularity = 5;
        } else {
            this.popularity = newPop;
        }
    }
    
    public void removePopularity(int pop) {
        int newPop = popularity -= pop;
        
        if (newPop <= 0) {
            this.popularity = 0;
        } else {
            this.popularity = newPop;
        }
    }
    
}
