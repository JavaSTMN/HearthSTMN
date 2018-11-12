package Jeu;

public class Deck {
	int nbDeckCard = 20;
	
	public Card[] createDeck() {
		Card deck[] = new Card[nbDeckCard];
		Card card = new Card();
		
		for (int i = 0; i != nbDeckCard; i++) {   
	        int n = (int)(Math.random() * 3);

	        switch (n) {
	        case 0:
	        	deck[i] = card.createCard1();
	        	break;
	        case 1:
	        	deck[i] = card.createCard2();
	        	break;
	        case 2:
	        	deck[i] = card.createCard3();
	        	break;
	        }  
		}
		
		return deck;
	}
	
}
