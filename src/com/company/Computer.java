package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Computer implements UserSelect {

    int userScore = 0;
    int computerScore = 0;
    int totalScore = userScore + computerScore;

    //Rock = 1
    //Paper = 2
    //Scissors = 3

    public static void startFight() {
        int rounds = 0;
        Computer cp = new Computer();

        while (cp.totalScore < 3) {
            if (rounds == 0) {
                System.out.println(
                    "\n"
                    + "Type in 'rock' 'paper' or 'scissors' to play." + "\n"
                    + "Type 'quit' to go back to the Main Menu" + "\n"
                    + "\n"
                    + "Firstttt Round!" + "\n"
                    + "\n"
                    + "BEGIN!!" + "\n"
                );
                moveSelect();
                rounds++;
            } else if (rounds == 1) {
                System.out.println(
                    "\n"
                    + "Type in 'rock' 'paper' or 'scissors' to play." + "\n"
                    + "Type 'quit' to go back to the Main Menu" + "\n"
                    + "\n"
                    + "Next Round" + "\n"
                    + "\n"
                    + "BEGIN!!" + "\n"
                );
                moveSelect();
                rounds++;
            } else if (rounds == 2) {
                System.out.println(
                    "\n"
                    + "Type in 'rock' 'paper' or 'scissors' to play." + "\n"
                    + "Type 'quit' to go back to the Main Menu" + "\n"
                    + "\n"
                    + "Final Round" + "\n"
                    + "\n"
                    + "BEGIN!!" + "\n"
                );
                moveSelect();
                rounds++;
//                System.out.println(computer().computerScore);
            }
        }
    }

    public static void moveSelect() {
        String userRPSSelect = select.nextLine();
        String userRPSSelection = userRPSSelect.toLowerCase();

        int randomNum = ThreadLocalRandom.current().nextInt(1, 2 + 1);

        switch (userRPSSelection) {
            case "rock":
                if (randomNum == 1) {
                    System.out.println(
                        "\n"
                        + "Computer picks: rock" + "\n"
                        + "User picks: rock" + "\n"
                        + "Draw!" + "\n"
                    );
                } else if (randomNum == 2) {
                    System.out.println(
                        "\n"
                        + "Computer picks: paper" + "\n"
                        + "User picks: rock" + "\n"
                        + "You lose!" + "\n"
                    );
//                    computerScore ++;
//                    System.out.println(computerScore);
                } else {
                    System.out.println(
                        "\n"
                        + "Computer picks: scissors" + "\n"
                        + "User picks: rock" + "\n"
                        + "You win!" + "\n"
                    );
//                    userScore ++;
                }
                break;
            case "paper":
                if (randomNum == 1) {
                    System.out.println(
                        "\n"
                        + "Computer picks: rock" + "\n"
                        + "User picks: paper" + "\n"
                        + "You win!" + "\n"
                    );
//                    userScore ++;
                } else if (randomNum == 2) {
                    System.out.println(
                        "\n"
                        + "Computer picks: paper" + "\n"
                        + "User picks: paper" + "\n"
                        + "Draw!" + "\n"
                    );
                } else {
                    System.out.println(
                        "\n"
                        + "Computer picks: scissors" + "\n"
                        + "User picks: paper" + "\n"
                        + "You lose!" + "\n"
                    );
//                    computerScore ++;
                }
                break;
            case "scissors":
                if (randomNum == 1) {
                    System.out.println(
                        "\n"
                        + "Computer picks: rock" + "\n"
                        + "User picks: scissors" + "\n"
                        + "You lose!" + "\n"
                    );
//                    computerScore ++;
                } else if (randomNum == 2) {
                    System.out.println(
                        "\n"
                        + "Computer picks: paper" + "\n"
                        + "User picks: scissors" + "\n"
                        + "You win!" + "\n"
                    );
//                    userScore ++;
                } else {
                    System.out.println(
                        "\n"
                        + "Computer picks: scissors" + "\n"
                        + "User picks: scissors" + "\n"
                        + "Draw!" + "\n"
                    );
                }
                break;
            case "quit":
                System.out.println();
                RockPaperScissors.gameStartUp();
                break;
            default:
                System.out.println("\n" + "Invalid input. Please try again!");
                System.out.println(
                    "\n"
                    + "Type in 'rock' 'paper' or 'scissors' to play." + "\n"
                    + "Type 'quit' to go back to the Main Menu" + "\n"
                    + "\n"
                );
                moveSelect();
                break;
        }
    }
}
