package javacode.exercises.CardArray;

public class Card {

    public static int cardCounter;

    public Card(){
        cardCounter++;
    }

    public void cardCreation(){

        Card[] cards = new Card[13];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new Card();
        }

    }

    }
