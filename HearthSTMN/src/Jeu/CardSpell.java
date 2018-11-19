package Jeu;

public class CardSpell extends Card{

	public CardSpell createCard1() {
		CardSpell card = new CardSpell();
		card.cardtype = "Spell";
		card.cardName = "Gloria's Exam";
		card.mana = 4;
		card.effect = "Damage : 6";
		 
		return card;
	}
	
	public CardSpell createCard2() {
		CardSpell card = new CardSpell();
		card.cardtype = "Spell";
		card.cardName = "Rattrapage";
		card.mana = 1;
		card.effect = "Damage : 3";
		 
		return card;
	}
	
	public CardSpell createCard3() {
		CardSpell card = new CardSpell();
		card.cardtype = "Spell";
		card.cardName = "";
		card.mana = 3;
		card.effect = "Draw : 2";
		 
		return card;
	}
}
