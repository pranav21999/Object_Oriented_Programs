package com.deck;

public class MainDeck {

    public static void main(String[] args) {
       DeckOfCards deckOfCards = new DeckOfCards();
       deckOfCards.deck();
	deckOfCards.shuffleDeck(suit,face);
        deckOfCards.displayCards();
    }

}
