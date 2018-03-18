package com.test;

import com.company.RockPaperScissors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
                + "2. Type 'history to view your game history" + "\n"
                + "Type 'quit' to stop playing" + "\n";
        String actual = testStartGameUp.gameStartUp();

        assertEquals(expected, actual);
    }

}

