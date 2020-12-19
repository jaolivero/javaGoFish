package com.FishGo;

import java.util.ArrayList;

public class Hand {
    private byte score;
    private ArrayList<Card> myHand = new ArrayList<>();
    private Player myPlayer;
    private Card card;

    public Hand(Player myPlayer) {
        this.myPlayer = myPlayer;
        this.myHand = new ArrayList<Card>();
    }

    public void addCard(Card dealt) {
        myHand.add(dealt);
    }

    public byte getScore() {
        return score;
    }

    public byte calculateScore() {
        for (Card myCard : myHand) {
            score += myCard.getValue();
        }
        return score;
    }

    public Player getMyPlayer() {
        return myPlayer;
    }

    public void setScore(byte reset) {
        score = reset;
    }

    @Override
    public String toString () {
        String output = "";
        for(Card card : myHand) {
            output += card + " ";
        }
        return output;
    }

//    public int findPairs(){
//        HashMap <Integer, Integer> quadrupleMap
//    }
}