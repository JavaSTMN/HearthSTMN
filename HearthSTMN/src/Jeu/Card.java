package Jeu;


public class Card {
	String cardName;
	int mana;
	int lifePoint;
	int attack;
	// image;
	// effet;
	
	public Card createCard1() {
		Card card = new Card();
		card.cardName = "Pépite";
		card.mana = 1;
		card.lifePoint = 1;
		card.attack = 2;
		 
		return card;
	}
	
	public Card createCard2() {
		Card card = new Card();
		card.cardName = "Le Rapace";
		card.mana = 4;
		card.lifePoint = 5;
		card.attack = 4;
		 
		return card;
	}
	
	public Card createCard3() {
		Card card = new Card();
		card.cardName = "The BOSS";
		card.mana = 8;
		card.lifePoint = 9;
		card.attack = 5;
		 
		return card;
	}
	
}
