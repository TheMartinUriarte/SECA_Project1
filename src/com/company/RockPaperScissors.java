package com.company;

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
}
