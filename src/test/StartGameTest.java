package test;

import org.junit.test;
import static org.junit.Assert.*;

public class StartGameTest {
    @Test
    public void gameStart_successfulGameStart() {
        String expected = "Welcome to Rock Paper Scissors!";
        String actual = startGame();

        assertEquals(expected, actual);
    }

}
