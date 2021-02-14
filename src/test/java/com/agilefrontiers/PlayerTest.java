package com.agilefrontiers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlayerTest {
    @Test
    public void constructorTest() {
        Player player1 = new Player("one");
        Player player2 = new Player("two");
        assertEquals(player1.getName(), "one");
        assertEquals(player2.getName(), "two");
    }

    public void scoreTest() {
        Player player1 = new Player("one");
        Deck deck = new Deck();
        player1.pick(deck);
        assertTrue(player1.score() == 1);
        player1.pick(deck);
        assertTrue(player1.score() == 3);
        player1.pick(deck);
        assertTrue(player1.score() == 6);
    }
}