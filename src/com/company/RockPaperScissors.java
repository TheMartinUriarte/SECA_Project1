package com.company;

import java.util.*;

public class RockPaperScissors implements UserSelect {

    public String gameStartUp() {

        String welcomeMSG_en =
            "Welcome to Rock Paper Scissors!" + "\n"
            + "\n"
            + "MAIN MENU" + "\n"
            + "=====" + "\n"
            + "1. Type 'play' to play" + "\n"
            + "2. Type 'history to view your game history" + "\n"
            + "Type 'quit' to stop playing" + "\n";

        System.out.println(welcomeMSG_en);

        return welcomeMSG_en;
    }


    public void menuSelect() {

        switch (userSelection) {
            case "play":
                System.out.println(
                    "\n"
                    + "Select your opponent!" + "\n"
                    + "1. 'Computer'" + "\n"
                    + "2. 'User 2'" + "\n"
                    + "\n");
                break;
            case "history":
                System.out.println("\n" + "History!");
                break;
            case "quit":
                System.out.println("\n" + "Quitting! Buh-bye!");
                break;
            default:
                System.out.println("\n" + "Invalid input. Please try again!");
                break;
        }
    }

    public void opponentSelect() {
        switch (userSelection) {
            case "computer":
                System.out.println("COMPUTER!!");
                break;
            case "user 2":
                System.out.println("PLAYER 2!!");
                break;
            default:
                System.out.println("\n" + "Invalid input2. Please try again!");
                break;
        }
    }
}
