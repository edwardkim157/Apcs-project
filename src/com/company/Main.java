package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String name = kb.nextLine();

        Account player1 = new Account(name);
        System.out.println("Welcome to the game " + name );
        System.out.println("You can do anything you want! Just enter the number in frount of the description of what you can do, to do that action!" + "\n" + "You can also type \"win\" to se if you are eligible to win");
        System.out.println("If you want to see the win requirements, please type \"win condition\"");
        System.out.println("Type \"1\" if you would like to work.");
        System.out.println("Type \"2\" if you would like to buy a fishing rod.");
        System.out.println("Type \"3\" if you would like to buy a shovel.");
        System.out.println("Type \"4\" if you would like to fish.");
        System.out.println("Type \"5\" if you would like to dig.");
        System.out.println("Type \"6\" if you would like to sell fish.");
        System.out.println("Type \"7\" if you would like to sell worms.");
        System.out.println("Type \"win\" if you would like to Win!." + "\n" + "Remember, if you type \"win\" while being not eligible, you will lose half your fish, worms, and coins!" );
    }
}
