package com.FishGo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public List<Player> allPlayers = new ArrayList<Player>();
    Deck deck = new Deck();
    Scanner scan = new Scanner(System.in);

    public Game () {
    }
    public void start() {
        deck.shuffle();
        System.out.println("Enter your username");
        String username = scan.nextLine();
        Player myPlayer = new Player(username);
        Hand myHand = new Hand(myPlayer);
        deal(5, deck, myHand);
        System.out.println(myPlayer.getUserName() + " Hand ");
        System.out.println(myHand);
    }

    public static void deal(int cardsDealt, Deck currentDeck, Hand currentHand) {
        for(int i = 0; i < cardsDealt; i++)
        {
            Card gettingCard = currentDeck.getCard(0);
            currentDeck.removeCard(0);
            currentHand.addCard(gettingCard);
            //System.out.println(gettingCard);
        }
    }

    public void printScore(Hand myHand) {
        System.out.println("SCORE");
        System.out.println("----");
        System.out.println(" " + myHand.getScore() + " ");
        System.out.println("----");
    }
}

