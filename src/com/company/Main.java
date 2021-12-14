/**
 * Class name: AP computer science
 * Purpose of the class: To create a fun money making game with minigames incorporated into it
 * Author: Edward Kim
 * Teacher’s name: Nabiha Khan
 * Date: December 3rd - December 15th
 */
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean Win = false;
        System.out.println("Hi! Welcome to the game. In order to start, Please enter your name!");
        Scanner kb = new Scanner(System.in);
        String name = kb.nextLine();
        Account player1 = new Account(name);
        System.out.println("Welcome to the game " + name );
        System.out.println("You can do anything you want! Just enter the number in frount of the description of what you can do, to do that action!" + "\n" + "You can also type \"win\" to se if you are eligible to win");
        System.out.println("If you want to see the win requirements, please type \"win condition\"");
        System.out.println("You can choose to name");
        System.out.println("Type \"work\" if you would like to work.");
        System.out.println("Type \"buyfishingrod\" if you would like to buy a fishing rod.");
        System.out.println("Type \"buyshovel\" if you would like to buy a shovel.");
        System.out.println("Type \"fish\" if you would like to fish.");
        System.out.println("Type \"dig\" if you would like to dig.");
        System.out.println("Type \"sellfish\" if you would like to sell a fish.");
        System.out.println("Type \"sellworm\" if you would like to sell a worm.");
        System.out.println("Type \"fish\" or \"worm\" if you want to see the balance of your fist/worm");
        System.out.println("Type \"win\" if you would like to Win!." + "\n" + "Remember, if you type \"win\" while being not eligible, you will lose half your fish, worms, and coins!" );
        Scanner Action = new Scanner(System.in);
        System.out.println("Now, type whatever number corresponding to the action you would like to ");
        while(Win != true) {
            String action = Action.nextLine();
            if (action.equalsIgnoreCase("work")){
                Actions.work(player1);
            }
            else if(action.equalsIgnoreCase("buyfishingrod")){
                player1.buyFishingRod(player1);
            }
            else if(action.equalsIgnoreCase("buyshovel")){
                player1.buyShovel();
            }
            else if(action.equalsIgnoreCase("fish")){
                Actions.fish(player1);
            }
            else if(action.equalsIgnoreCase("dig")){
                Actions.dig(player1);
            }
            else if(action.equalsIgnoreCase("sellfish")){
                Actions.sell(player1, 1, "fish");
            }
            else if(action.equalsIgnoreCase("sellworm")){
                Actions.sell(player1, 1, "worm");
            }
            else if(action.equalsIgnoreCase("win condition")){
                System.out.println("In order to win, you need to have 50 fish, 30 worms, and at least 15,000 dollars. Using those items, you much buy a the item \"diamond jewel\" and \"crown\", then use those two items to create a crown jewel.");
            } else if (action.equalsIgnoreCase("Win")){
                if(player1.fishBalance() > 50 && player1.wormsBalance() > 30 && player1.getBalance()>15000){
                    System.out.println("You are eligible to win! If you would like to buy the items necessary to win, type \"buy win items\"");
                }
                else{
                    System.out.println("You typed win even though you were not eligible! you lost half of your coins, fishes, and worms!");
                    player1.subtractFishBalance(player1.fishBalance()/2);
                    player1.subtractWormBalance(player1.wormsBalance()/2);
                    player1.subtractBalance(player1.getBalance()/2);
                }
            }
        }
    }
}
