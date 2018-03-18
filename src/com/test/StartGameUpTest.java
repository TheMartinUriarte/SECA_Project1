package com.test;

import com.company.StartGameUp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StartGameUpTest extends StartGameUp {

    private StartGameUp testStartGameUp;

    @Before
    public void setUp() {
        testStartGameUp = new StartGameUp();
    }

    @Test
    public void startGameUp_successfulStartGameUp() {

        String expected = "Welcome to Rock Paper Scissors!";
        String actual = this.welcomeMSG_en;

        assertEquals(expected, actual);
    }

//    @Test
//    public void mainMenu_successfulMainMenu() {
//        String expected = "MAIN MENU\ ====\ 1. Type 'play' to play\ 2. Type 'history' to view your game history\Type 'quit' to stop playing";
//        String actual = mainMenu();
//
//        assertEquals(expected, actual);
//    }

}
