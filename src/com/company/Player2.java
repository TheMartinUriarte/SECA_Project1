package com.company;


public class Player2 implements UserSelect {

    public static void startFightP2() {
        int rounds = 0;

        while (rounds < 3) {
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
            }
        }
    }

    public static void moveSelect() {
        String user1Select = select.nextLine();
        String user1Selection = user1Select.toLowerCase();

        String user2Select = select.nextLine();
        String user2Selection = user2Select.toLowerCase();


        switch (user1Selection) {
            case "rock":
                switch (user2Selection) {
                    case "rock":
                        System.out.println(
                            "\n"
                            + "Player 1 picks: rock" + "\n"
                            + "Player 2 picks: rock" + "\n"
                            + "Draw!" + "\n"
                        );
                        break;
                    case "paper":
                        System.out.println(
                            "\n"
                            + "Player 1 picks: rock" + "\n"
                            + "Player 2 picks: paper" + "\n"
                            + "Player 2 Wins!" + "\n"
                        );
                        break;
                    case "scissors":
                        System.out.println(
                            "\n"
                            + "Player 1 picks: rock" + "\n"
                            + "Player 2 picks: scissors" + "\n"
                            + "Player 1 Wins!" + "\n"
                        );
                        break;
                }
                break;
            case "paper":
                switch (user2Selection) {
                    case "rock":
                        System.out.println(
                            "\n"
                            + "Player 1 picks: paper" + "\n"
                            + "Player 2 picks: rock" + "\n"
                            + "Player 1 Wins!" + "\n"
                        );
                        break;
                    case "paper":
                        System.out.println(
                            "\n"
                            + "Player 1 picks: paper" + "\n"
                            + "Player 2 picks: paper" + "\n"
                            + "Draw!" + "\n"
                        );
                        break;
                    case "scissors":
                        System.out.println(
                            "\n"
                            + "Player 1 picks: paper" + "\n"
                            + "Player 2 picks: scissors" + "\n"
                            + "Player 2 Wins!" + "\n"
                        );
                        break;
                }
                break;
            case "scissors":
                switch (user2Selection) {
                    case "rock":
                        System.out.println(
                            "\n"
                            + "Player 1 picks: scissors" + "\n"
                            + "Player 2 picks: rock" + "\n"
                            + "Player 2 Wins!" + "\n"
                        );
                        break;
                    case "paper":
                        System.out.println(
                            "\n"
                            + "Player 1 picks: scissors" + "\n"
                            + "Player 2 picks: paper" + "\n"
                            + "Player 1 Wins!" + "\n"
                        );
                        break;
                    case "scissors":
                        System.out.println(
                            "\n"
                            + "Player 1 picks: scissors" + "\n"
                            + "Player 2 picks: scissors" + "\n"
                            + "Draw!" + "\n"
                        );
                        break;
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
//                    computerScore ++;
//                    System.out.println(computerScore);
//                    userScore ++;