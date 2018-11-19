package Jeu;

import java.util.ArrayList;

public class Hand {
	int nbCard;
	
	public ArrayList<Card> startHand(Card[] deck, Deck d) {
		ArrayList<Card> hand = new ArrayList<Card>();
		Card card;
		for (int i = 0; i < 3; i++) {
			card = draw(deck, d);
			hand.add(card);
		}
		
		return hand;
	}
	
	public Card draw(Card[] deck, Deck d) {
		Card card = new Card();
		int nbCardDeck = d.nbDeckCard - 1;	

		card.cardName = (deck[nbCardDeck]).cardName;
		card.mana = (deck[nbCardDeck]).mana;
		card.lifePoint = (deck[nbCardDeck]).lifePoint;
		card.attack = (deck[nbCardDeck]).attack;
		d.nbDeckCard = d.nbDeckCard - 1;
		
		System.out.println(card);
		return card;
	}
	
}
