package Jeu;

import java.util.ArrayList;

public class Hand {
	int nbCard = 0;
	
	public ArrayList<Card> startHand(Card[] deck, Deck d) {
		ArrayList<Card> hand = new ArrayList<Card>();
		Card card;
		for (int i = 0; i < 3; i++) {
			card = draw(deck, d, null);
			hand.add(card);
		}

		return hand;
	}
	
	public Card draw(Card[] deck, Deck d, Hero h) {
		Card card = new Card();
		int nbCardDeck = d.nbDeckCard - 1;
		
		if (nbCardDeck >= 0) {
			card.cardtype = (deck[nbCardDeck]).cardtype;
			card.cardName = (deck[nbCardDeck]).cardName;
			card.mana = (deck[nbCardDeck]).mana;
			
			switch (card.cardtype) {
				case "Monstre" :
					card.lifePoint = (deck[nbCardDeck]).lifePoint;
					card.attack = (deck[nbCardDeck]).attack;
					break;
					
				case "Sort" :
					
					break;
			}
			if (nbCard < 10) {
				nbCard = nbCard + 1;
			}
			d.nbDeckCard = d.nbDeckCard - 1;
		} else {
			System.out.println("Vous n'avez plus de carte.");
			h.takeDamage(h.exhaust);
			h.exhaust = h.exhaust + 1;
			return card;
		}
		
		return card;
	}
	
	public static void verifHand(ArrayList<Card> tab, Hand hand, Card[] deck, Deck d, Hero h) {
		if (tab.size() < 10) {
			tab.add(hand.draw(deck, d, h));
		} else {
			hand.draw(deck, d, h);
		}
	}
	
}
