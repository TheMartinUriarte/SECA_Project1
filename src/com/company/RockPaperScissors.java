package com.company;

import java.util.*;

import static java.lang.System.in;

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
        menuSelect();

        return welcomeMSG_en;
    }


    public void menuSelect() {
        String userMenuSelect = select.nextLine();
        String userMenuSelection = userMenuSelect.toLowerCase();

        switch (userMenuSelection) {
            case "play":
                System.out.println(
                    "\n"
                    + "Select your opponent!" + "\n"
                    + "1. 'Computer'" + "\n"
                    + "2. 'User 2'" + "\n");
                opponentSelect();
                break;
            case "history":
                System.out.println("\n" + "History!");
                break;
            case "quit":
                System.out.println("\n" + "Quitting! Buh-bye!");
                break;
            default:
                System.out.println("\n" + "Invalid input. Please try again!" + "\n");
                gameStartUp();
                break;
        }
    }

    public void opponentSelect() {
        String userOppSelect = select.nextLine();
        String userOppSelection = userOppSelect.toLowerCase();

        switch (userOppSelection) {
            case "computer":
                System.out.println("\n" + "COMPUTER!!");
                break;
            case "user 2":
                System.out.println("\n" + "PLAYER 2!!");
                break;
            default:
                System.out.println("\n" + "Invalid input2. Please try again!");
                break;
        }
    }
}
