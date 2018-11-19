package Jeu;

public class CardMonster extends Card{
	
	public CardMonster createCard1() {
		CardMonster card = new CardMonster();
		card.cardtype = "Monstre";
		card.cardName = "Pépite";
		card.mana = 1;
		card.lifePoint = 1;
		card.attack = 2;
		 
		return card;
	}
	
	public CardMonster createCard2() {
		CardMonster card = new CardMonster();
		card.cardtype = "Monstre";
		card.cardName = "Le Rapace";
		card.mana = 4;
		card.lifePoint = 5;
		card.attack = 4;
		 
		return card;
	}
	
	public CardMonster createCard3() {
		CardMonster card = new CardMonster();
		card.cardtype = "Monstre";
		card.cardName = "The BOSS";
		card.mana = 8;
		card.lifePoint = 9;
		card.attack = 5;
		 
		return card;
	}
	
}
