package com.company;

public class Main {



    public static void main(String[] args){
        System.out.println("Enter your name");

        Account a = new Account("klkkl");

        int choice = 0;
        while (true) {
            System.out.println("Enter your choice");
            switch (choice) {
                case 1:
                    a.fishBalance();
                    break;
                default:
                    a.buyFishingRod();
                    break;
            }
        }
    }
}
