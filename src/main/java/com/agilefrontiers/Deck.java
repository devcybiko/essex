package com.agilefrontiers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Deck {
    private List<Card> cards = new ArrayList<Card>();

    public Deck() {
        init();
    }

    public Deck(boolean init) {
        if (init) init();
    }

    private void init() {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Value value : Card.Value.values()) {
                cards.add(new Card(suit, value));
            }
        }
    }

    public List<Card> getCards() {
        return this.cards;
    }

    public void shuffle() {
        List<Card> newCards = new ArrayList<Card>();
        while (this.cards.size() != 0) {
            int rnd = Util.random(0, this.cards.size());
            Card rndCard = this.cards.get(rnd);
            this.cards.remove(rndCard);
            newCards.add(rndCard);
        }
        this.cards = newCards;
    }

    // as per spec, this will throw an exception on error
    // here, I'm documenting which exception is thrown
    // it's an unchecked exception thrown by Array.remove()
    public Card pick() throws UnsupportedOperationException {
        return this.cards.remove(0);
    }

    public void sort() {
        Comparator<Card> comparator = new Comparator<Card>() {
			@Override
			public int compare(Card a, Card b) {
                int diff = a.getSuit().ordinal() - b.getSuit().ordinal();
                if (diff == 0) diff = a.getValue().ordinal() - b.getValue().ordinal();
                return diff;
			}
        };
        Collections.sort(cards, comparator);
    }
}