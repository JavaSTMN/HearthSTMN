package Jeu;

import java.util.ArrayList;

public class Status {
	Hero hero;
	Deck deck;
	Hand hand;
	Card[] deckPlayer;
	ArrayList<Card> handPlayer;
	Mana mana;
	
	public Status() {
		hero = new Hero();
		deck = new Deck();
		hand = new Hand();
		mana = new Mana();
		deckPlayer = deck.createDeck();
		handPlayer = hand.startHand(deckPlayer, deck);
	}
}
