package com.agilefrontiers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import com.agilefrontiers.Card.Suit;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CardTest {
    @Test
    public void constructorTest() {
        Card card = new Card(Card.Suit.Diamonds, Card.Value.Ace);
        assertEquals("Ace of Diamonds", card.toString());
    }

    @Test
    public void suitTest() {
        List<Card.Suit> suits = Arrays.asList(Card.Suit.Spades, Card.Suit.Diamonds, Card.Suit.Hearts, Card.Suit.Clubs);
        int i = 0;
        for (Card.Suit suit : Card.Suit.values()) {
            Card.Suit testSuit = suits.get(i);
            assertEquals(testSuit, suit);
            assertEquals(suit.ordinal(), i);
            i++;
        }
        assertEquals(i, 4);
    }

    @Test
    public void valueTest() {
        List<Card.Value> values = Arrays.asList(Card.Value.Ace, Card.Value.Two, Card.Value.Three, Card.Value.Four,
                Card.Value.Five, Card.Value.Six, Card.Value.Seven, Card.Value.Eight, Card.Value.Nine, Card.Value.Ten,
                Card.Value.Jack, Card.Value.Queen, Card.Value.King);
        int i = 0;
        for (Card.Value value : Card.Value.values()) {
            Card.Value testValue = values.get(i);
            assertEquals(testValue, value);
            assertEquals(value.ordinal(), i);
            i++;
        }
        assertEquals(i, 13);
    }

    @Test
    public void scoreTest() {
        Deck deck = new Deck();
        int[] scores = {1,2,3,4,5,6,7,8,9,10,11,12,13,2,4,6,8,10,12,14,16,18,20,22,24,26,3,6,9,12,15,18,21,24,27,30,33,36,39,4,8,12,16,20,24,28,32,36,40,44,48,52};
        int i=0;
        for(Card card : deck.getCards()) {
            assertTrue(card.score() == scores[i++]);
        }
    }
}
