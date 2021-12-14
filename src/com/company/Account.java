/**
 * Class name: AP computer science
 * Purpose of the class: To create a fun money making game with minigames incorporated into it
 * Author: Edward Kim
 * Teacher’s name: Nabiha Khan
 * Date: December 3rd - December 15th
 */
package com.company;

import java.sql.SQLOutput;

public class Account {
    private String name;
    private double balance;
    private boolean luck;
    private boolean padlock;
    private static boolean fishingRod;
    private boolean shovel;
    private int fishBalance;
    private int wormsBalance;

    public Account(String name){
        this.name = name;
        balance = 0;
        padlock = false;
        fishingRod = false;
        shovel = false;
    }

    public int fishBalance(){
        System.out.println("You have " + fishBalance + " amount of fish");
        return fishBalance;
    }

    public int wormsBalance(){
        System.out.println("You have " + wormsBalance + " amount of fish");
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

    public static boolean getFishingRod(){
        return fishingRod;
    }

    public boolean getShovel(){
        return shovel;
    }

    public boolean setFishingRod(boolean fishing){
        fishingRod = fishing;
        return fishing;
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
    public boolean buyFishingRod(Account account) {
        if (account.getBalance() > 1000.0) {
            account.subtractBalance(1000);;
            account.setFishingRod(true);
            System.out.println("You bought a fishing rod");
        } else {
            System.out.println("You're too broke for a fishing rod!");
        }
        return fishingRod;
    }

    public void addBalance(double money) {
        balance+= money;
    }

    public void subtractBalance(double money){
        balance -= money;
    }
    public void subtractFishBalance(int x){
        fishBalance -= x;
    }
    public void subtractWormBalance(int x){
        wormsBalance -= x;
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
