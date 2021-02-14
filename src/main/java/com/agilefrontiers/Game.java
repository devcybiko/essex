package com.agilefrontiers;

public class Game {
    private Deck deck ;
    private Player one;
    private Player two;

    public Game(String n1, String n2) {
        one = new Player(n1);
        two = new Player(n2);
        deck =new Deck();
        deck.shuffle();
    }

    public Player winner() {
        if (one.score()  > two.score()) return one;
        if (one.score() < two.score()) return two;
        return null;
    }

    public void play(int rounds) {
        for(int i=0; i<rounds; i++) {
            one.pick(deck);
            two.pick(deck);
        }
    }

    public void results () {
        Player winner = this.winner();
        if (winner != null) System.out.println(winner.getName() + " Wins!");
        else System.out.println("It's a tie!");
        System.out.println(one.getName() + ": " + one.score());
        System.out.println(two.getName() + ": " + two.score());
    }

    
}