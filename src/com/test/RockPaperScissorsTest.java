package com.test;

import com.company.RockPaperScissors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class RockPaperScissorsTest extends RockPaperScissors {

    private RockPaperScissors testStartGameUp;

    @Before
    public void setUp() {
        testStartGameUp = new RockPaperScissors();
    }

    @Test
    public void startGameUp_successfulStartGameUp() {

        String expected =
                "Welcome to Rock Paper Scissors!" + "\n"
                + "\n"
                + "MAIN MENU" + "\n"
                + "=====" + "\n"
                + "1. Type 'play' to play" + "\n"
                + "2. Type 'history' to view your game history" + "\n"
                + "Type 'quit' to stop playing" + "\n"
                + "\n";
        String actual = testStartGameUp.gameStartUp();

        assertEquals(expected, actual);
    }

//    @Test
//    public void menuSelect_successfulMenuSelect() {
//        Scanner select = new Scanner(System.in);
//        String userSelects = select.nextLine();
//        String userSelection = userSelects.toLowerCase();
//
//            switch (userSelection) {
//                case "play":
//                    System.out.println(
//                            "Select your opponent!" + "\n"
//                                    + "1. 'Computer'" + "\n"
//                                    + "2. 'User 2'" + "\n"
//                                    + "\n");
//                    break;
//                case "history":
//                    System.out.println("History!");
//                    break;
//                case "quit":
//                    System.out.println("Quitting! Buh-bye!");
//                    break;
//                default:
//                    System.out.println("Invalid input. Please try again!");
//                    break;
//            }
//
//        assertTrue(testStartGameUp.menuSelect_successfulMenuSelect("play") == RockPaperScissors.menuSelect("play"));
//    }

}

