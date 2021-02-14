package com.agilefrontiers;

import org.junit.Test;

public class GameTest {
    @Test
    public void constructorTest() {
        Game game = new Game("Player One", "Player Two");
        game.play(3);
        game.results();
    }
    @Test
    public void tieGameTest() {
        Game game = new Game("Player One", "Player Two");
        game.results();
    }
}