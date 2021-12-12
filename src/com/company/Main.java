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
        System.out.println("If you wanna see the win requirements, please type \"win condition\"");
    }
}
