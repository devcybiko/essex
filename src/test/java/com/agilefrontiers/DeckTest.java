package com.agilefrontiers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DeckTest {
    @Test
    public void constructorTest() {
        Deck deck = new Deck();
        int i = 0;
        for(Card.Suit suit : Card.Suit.values()) {
            for(Card.Value value : Card.Value.values()) {
                Card card = deck.getCards().get(i++);
                Card testCard = new Card(suit, value);
                assertTrue(testCard.equals(card));
            }
        }
        assertEquals(i, 52);
    }

    //@Test
    public void shuffleTest() {
        Deck deck = new Deck(true);
        Deck ordinalDeck = new Deck(true);
        deck.shuffle();
        // how do we test randomness??
        // this is an iffy test that asks that no card is in its original position
        // it will fail randomly from time to time
        for(int i=0; i<deck.getCards().size(); i++) {
            Card card = deck.pick();
            Card ordinalCard = ordinalDeck.pick();
            assertFalse("The randomness test is failing - likey not a true error. Just rerun the test.", card.equals(ordinalCard));
        }
    }

    @Test
    public void sortTest() {
        Deck deck = new Deck(true);
        Deck ordinalDeck = new Deck(true);
        deck.shuffle();
        deck.sort();
        for(int i=0; i<deck.getCards().size(); i++) {
            Card card = deck.pick();
            Card ordinalCard = ordinalDeck.pick();
            assertTrue(card.equals(ordinalCard));
        }
    }
}