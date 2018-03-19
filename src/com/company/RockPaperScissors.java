package com.company;

import static com.company.Computer.startFight;
import static com.company.Player2.startFightP2;

public class RockPaperScissors implements UserSelect {

    public static String gameStartUp() {

        String welcomeMSG_en =
            "Welcome to Rock Paper Scissors!" + "\n"
            + "\n"
            + "MAIN MENU" + "\n"
            + "=====" + "\n"
            + "1. Type 'play' to play" + "\n"
            + "2. Type 'history' to view your game history" + "\n"
            + "Type 'quit' to stop playing" + "\n";

        System.out.println(welcomeMSG_en);
        menuSelect();

        return welcomeMSG_en;
    }

    public static void menuSelect() {
        String userMenuSelect = select.nextLine();
        String userMenuSelection = userMenuSelect.toLowerCase();

        switch (userMenuSelection) {
            case "play":
                System.out.println(
                    "\n"
                    + "Select your opponent!" + "\n"
                    + "1. 'vs Computer'" + "\n"
                    + "2. '2 players'" + "\n"
                    + "Type 'quit' to go back to the Main Menu" + "\n"
                );
                opponentSelect();
                break;
            case "1":
                System.out.println(
                    "\n"
                    + "Select your opponent!" + "\n"
                    + "1. 'vs Computer'" + "\n"
                    + "2. '2 players'" + "\n"
                    + "Type 'quit' to go back to the Main Menu" + "\n"
                );
                opponentSelect();
                break;
            case "history":
                System.out.println("\n" + "History!");
                break;
            case "2":
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

    public static void opponentSelect() {
        String userOppSelect = select.nextLine();
        String userOppSelection = userOppSelect.toLowerCase();

        switch (userOppSelection) {
            case "vs computer":
                System.out.println("\n" + "VERSUS COMPUTER!!");
                startFight();
                break;
            case "1":
                System.out.println("\n" + "VERSUS COMPUTER!!");
                startFight();
                break;
            case "2 players":
                System.out.println("\n" + "HERE COMES A MIGHTY WARRIOR!!");
                startFightP2();
                break;
            case "2":
                System.out.println("\n" + "HERE COMES A MIGHTY WARRIOR!!");
                startFightP2();
                break;
            case "quit":
                System.out.println();
                gameStartUp();
                break;
            default:
                System.out.println("\n" + "Invalid input. Please try again!");
                System.out.println(
                        "\n"
                        + "Select your opponent!" + "\n"
                        + "1. 'vs Computer'" + "\n"
                        + "2. '2 players'" + "\n");
                opponentSelect();
                break;
        }
    }
}
