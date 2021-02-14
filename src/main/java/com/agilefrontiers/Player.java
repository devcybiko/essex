package com.agilefrontiers;

import java.util.List;

public class Player {
    private String name;
    private Deck hand;

    public Player(String name) {
        this.setName(name);
        this.hand = new Deck(false);
    }

    public void pick(Deck deck) {
        Deck hand = this.hand;
        List<Card> cards = hand.getCards();
        Card card = deck.pick();
        cards.add(card);
    }

    public int score() {
        int score = 0;
        for(Card card : hand.getCards()) score += card.score();
        return score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}