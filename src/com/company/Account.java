package com.company;

import java.sql.SQLOutput;

public class Account {
    private String name;
    private double balance;
    private boolean luck;
    private boolean padlock;
    private boolean fishingRod;
    private boolean shovel;
    private int fishBalance;
    private int wormsBalance;

    public Account(String name){
        this.name = name;
        balance = 0;
        luck = false;
        padlock = false;
        fishingRod = false;
        shovel = false;
    }

    public int fishBalance(){
        System.out.println("You have " + fishBalance + " amount of fish");
        return fishBalance;
    }

    public int wormsBalance(){
        return wormsBalance;
    }

    public boolean buyLuck(){
        if(balance>10000.0){
            balance -= 5000.0;
            luck = true;
        }
        else{
            System.out.println("Not enough money on account to buy luck");
        }
        return luck;
    }

    public boolean getLuck(){
        return luck;
    }

    public boolean getFishingRod(){
        return fishingRod;
    }

    public boolean getShovel(){
        return shovel;
    }

    public boolean buyShovel(){
        if(balance>1000.0){
            balance -= 1000.0;
            shovel = true;
            System.out.println("You bought a shovel");
        }
        else{
            System.out.println("You're too broke for a shovel!");
        }
        return shovel;
    }

    public boolean buyFishingRod() {
        if (balance > 1000.0) {
            balance -= 1000.0;
            fishingRod = true;
            System.out.println("You bought a fishing rod");
        } else {
            System.out.println("You're too broke for a fishing rod!");
        }
        return fishingRod;
    }

    public boolean getPadlock(){
        if(balance>2500.0){
            balance -= 2500.0;
            padlock = true;
        }

        else{
            System.out.println("Not enough money for padlock :/");
        }
        return padlock;
    }

    public void addBalance(double money) {
        balance+= money;
    }

    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public void setFishBalance(int x){
        fishBalance+=x;
    }
    public void setWormsBalance(int x){
        wormsBalance+=x;
    }



    public static void main(String []args){

    }
}
