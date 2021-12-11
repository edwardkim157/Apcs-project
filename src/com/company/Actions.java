package com.company;
import javax.swing.*;
import java.net.SocketOption;

public class Actions {
    public static String winningItem = "WinningItem";
    private static int salary = 6500;
    private static int actionCount = 0;
    private static int fishPrice = 100;
    private static int wormsPrice = 100;

    public static void sell(Account account, int num, String item){  //selling the fish made through fishing
        if(item.equalsIgnoreCase("fish")) {
            if (account.fishBalance() >= num) {
                System.out.println("You have sold " + num + " amount of fish!");
                account.addBalance((double)(fishPrice * account.fishBalance()));
            }
            else{
                System.out.println("You cant sell more fish than you own!");
            }
        }
        else if(item.equalsIgnoreCase("Worms")){
            if(account.wormsBalance() >= num){
                System.out.println("You have sold " + num + " amount of worms!");
                account.addBalance((double)(wormsPrice * account.wormsBalance()));
            }
            else{
                System.out.println("You cant sell more worms than you actually own!");
            }
        }
        else{
            System.out.println("You can only sell fish or worms!");
        }

    }

    public static void work(Account account) { //user will need to win in a simple game of balckjack to get coins
        int playerRandomNum = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1); //variable initalizations for player
        int playerRandomNum2 = (int) Math.floor(Math.random() * (11 - 1 + 1) + 1);
        int computerRandomNum = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1); //variable initalizations for computer
        int computerRandomNum2 = (int) Math.floor(Math.random() * (11 - 1 + 1) + 1);
        int playertotal = playerRandomNum + playerRandomNum2; //playertotal (before hit/stand/forefit)
        int computertotal = computerRandomNum + computerRandomNum2; //computertotal (not told to player)
        if (playertotal == 21) {  //win condition for player
            System.out.println("You win! Money has been added to your account");
            account.addBalance(salary);
        }

        while (playertotal < 21 && computertotal < 21) { //condition for playing the game (player's cards are less than 21)
            JOptionPane.showMessageDialog(null, "Your number is " + playertotal + " please type whether or not you would like to hit, stand, or forefit");
            String decision = JOptionPane.showInputDialog("please enter what you would like to do", "Input");
            if (decision.equalsIgnoreCase("hit")) { //Player hits
                int playerSecondNum = (int) Math.floor(Math.random() * (11 - 1 + 1) + 1);
                playertotal += playerSecondNum;
            }
            else if (decision.equalsIgnoreCase("stand")){  //player stands
                if(21-playertotal < 21-computertotal){ //Checking who won
                    System.out.println("You win!");
                    account.addBalance(salary);
                }
                break;
            }
            else if(decision.equalsIgnoreCase("Forefit")){  //player forefits
                System.out.println("You forefit :/ you lost");
                break;
            }
        }
        if (playertotal > 21) {  //Lose condition
                System.out.println("Im sorry, you lost :p");
            }
        else if (computertotal > 21) { //win condition by computer bust
                System.out.println("The computer busted! You win");
                account.addBalance(salary);
            }
        else if (playertotal > 21 && computertotal > 21) { //if both
                System.out.println("Tie game! Half of your salary has been paid");
                    account.addBalance(salary/2);
            }
    }

    public static void fish(Account account) {
        if (account.getFishingRod() == true) {
            int rand = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
            if (rand <= 6) {
                account.setFishBalance(2);
                System.out.println("Congratulations! You caught 2 fishes!");
            } else if (rand > 6 && rand < 10) {
                account.setFishBalance(1);
                System.out.println("Congratulations! You caught a fish!");
            } else {
                System.out.println("The fish took your fishing rod!");
            }
        }
        else{
            System.out.println("You need to buy a fishing rod to fish smh.");
        }
    }

    public static void dig(Account account){
        if(account.getShovel() == true){

        }
        else{
            System.out.println("You need to buy a shovel to dig man");
        }

    }
    public static void main(String []args){

    }
}
