package test;

import org.junit.test;
import static org.junit.Assert.*;

public class StartGameTest {
    @Test
    public void gameStartUp_successfulGameStartUp() {
        String expected = "Welcome to Rock Paper Scissors!";
        String actual = startGame();

        assertEquals(expected, actual);
    }

    @Test
    public void mainMenu_successfulMainMenu() {
        String expected = "MAIN MENU\====\1. Type 'play' to play\2. Type 'history' to view your game history\Type 'quit' to stop playing";
        String actual = mainMenu();

        assertEquals(expected, actual);
    }

}
