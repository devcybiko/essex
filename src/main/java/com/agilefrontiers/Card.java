package com.agilefrontiers;

public class Card {
    public enum Suit {
        Spades, Diamonds, Hearts, Clubs;
    }
    public enum Value {
        Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King;
    }

    private Suit suit;
    private Value value;
    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }
    public Suit getSuit() {
        return this.suit;
    }

    public Value getValue() {
        return this.value;
    }

    public boolean equals(Card that) {
        return (this.suit == that.suit && this.value == that.value);
    }

    public int score() {
        return (this.suit.ordinal() + 1) * (this.value.ordinal()+ 1);
    }

    public String toString() {
        return this.value.toString() + " of " + this.suit.toString();
    }
}
