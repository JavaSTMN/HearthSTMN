package Jeu;

public class Deck {
	int nbDeckCard = 20;
	
	public Card[] createDeck() {
		Card deck[] = new Card[nbDeckCard];
		CardMonster cardM = new CardMonster();
		CardSpell cardS = new CardSpell();
		
		for (int i = 0; i != nbDeckCard; i++) {   
	        int n = (int)(Math.random() * 4);

	        switch (n) {
	        case 0:
	        	deck[i] = cardM.createCard1();
	        	break;
	        case 1:
	        	deck[i] = cardM.createCard2();
	        	break;
	        case 2:
	        	deck[i] = cardM.createCard3();
	        	break;
	        case 3:
				deck[i] = cardS.createCard1();
				break;
	        }  		
		}
		
		return deck;
	}
	
}
