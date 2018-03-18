package com.company;

import java.util.Scanner;

public class RockPaperScissors {

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
        Scanner select = new Scanner(System.in);
        String userSelects = select.nextLine();
        String userSelection = userSelects.toLowerCase();

        switch (userSelection) {
            case "play":
                System.out.println(
                        "Select your opponent!" + "\n"
                                + "1. 'Computer'" + "\n"
                                + "2. 'User 2'" + "\n"
                                + "\n");
                break;
            case "history":
                System.out.println("History!");
                break;
            case "quit":
                System.out.println("Quitting! Buh-bye!");
                break;
            default:
                System.out.println("Invalid input. Please try again!");
                break;
        }
    }
}
