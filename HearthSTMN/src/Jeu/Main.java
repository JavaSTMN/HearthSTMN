package Jeu;

import java.io.IOException;
import java.util.ArrayList;

import Interface.Interface;
import Interface.Menu;


public class Main {
	  public static void main(String[] args) throws IOException {	  
		  Menu menu = new Menu();
		  menu.setVisible(true);
	  } 
	
	  public static void startGame() throws IOException {
		  Interface inter = new Interface();
		  Status player1 = new Status();
		  System.out.println("Hero1 : " + player1.hero.lifePoint);
		  Status player2 = new Status();
		  System.out.println("Hero2 : " + player1.hero.lifePoint);
		  System.out.println("----------");

		  boolean endGame = true;
		  boolean endTurn = true;
		  boolean tp = false;
		  Status turnPlayer = player1;
		  int end = 0;

		  System.out.println("Start Game !");
		  System.out.println("----------");
		  while (endGame) {

			  if (tp == false) {
				  turnPlayer = player1;
				  System.out.println("Player 1 turn");
				  System.out.println("Your Hero : " + player1.hero.lifePoint);
				  System.out.println("Ennemie Hero : " + player2.hero.lifePoint);
				  tp = true;
			  } else {
				  turnPlayer = player2;
				  System.out.println("Player 2 turn");
				  System.out.println("Your Hero : " + player2.hero.lifePoint);
				  System.out.println("Ennemie Hero : " + player1.hero.lifePoint); 
				  tp = false;
			  }
			  endTurn = true;
			  while (endTurn) {
				  Hand.verifHand(turnPlayer.handPlayer, turnPlayer.hand, turnPlayer.deckPlayer, turnPlayer.deck, turnPlayer.hero);
				  turnPlayer.mana.increase();
				  System.out.println("nbCardDeck :" + turnPlayer.deck.nbDeckCard);
				  System.out.println("nbCardHand : " + turnPlayer.hand.nbCard);
				  System.out.println("mana : " + turnPlayer.mana.currentMana);
				  
				  int j = 0;
				  int maxWhile = turnPlayer.hand.nbCard;
				  
				  while (j < maxWhile) {
					  if ((turnPlayer.handPlayer.get(j)).cardtype == "Monstre") {
						  System.out.println("Card" + (j + 1) + ": " + 
						  (turnPlayer.handPlayer.get(j)).cardName + " - " + 
						  (turnPlayer.handPlayer.get(j)).mana + 
						  "(" + (turnPlayer.handPlayer.get(j)).attack + "/" + (turnPlayer.handPlayer.get(j)).lifePoint + ")");
					  } else {
						  System.out.println("Card" + (j + 1) + ": " + (turnPlayer.handPlayer.get(j)).cardName + 
						  " - " + 
						  (turnPlayer.handPlayer.get(j)).mana + 
						  "(" + (turnPlayer.handPlayer.get(j)).effect + ")");
					  }
					  
					  j++;
					  
				  }
				  
				  System.out.println("\nWhat do you do?");
				  System.out.println("Choose a number for play card (" + maxWhile + ") or 0 for end turn.");
				  System.out.println("\r");
				  endTurn = false;
				  end++;
			  }
			  
			  if (end == 39) {
				  endGame = false; 
			  }
			  
		  }
		  
		  // Création des 2 héros
		  Hero hero1 = new Hero();
		  Hero hero2 = new Hero();
		  
		  Deck deck1 = new Deck();
		  Deck deck2 = new Deck();
		  
		  Hand hand1 = new Hand();
		  Hand hand2 = new Hand();
		  
		  // Création des 2 deck
		  Card[] deckPlayeur1;
		  deckPlayeur1 = deck1.createDeck();
		  
		  Card[] deckPlayeur2;
		  deckPlayeur2 = deck2.createDeck();
		  
		  ArrayList<Card> handPlayer1 = hand1.startHand(deckPlayeur1, deck1);
		  ArrayList<Card> handPlayer2 = hand1.startHand(deckPlayeur2, deck2);
		  
		  System.out.println("deck j1");
		  System.out.println(deck1.nbDeckCard);
		  System.out.println("Main j1");
		  System.out.println((handPlayer1.get(0)).cardName);
		  System.out.println((handPlayer1.get(1)).cardName);
		  System.out.println((handPlayer1.get(2)).cardName);
		  
		  System.out.println("deck j2");
		  System.out.println(deck1.nbDeckCard);
		  System.out.println("Main j2");
		  System.out.println((handPlayer2.get(0)).cardName);
		  System.out.println((handPlayer2.get(1)).cardName);
		  System.out.println((handPlayer2.get(2)).cardName);

		  int i = 0;
		while (i < 25) {
			System.out.println("Dans while --------------------");
			 Hand.verifHand(handPlayer1, hand1, deckPlayeur1, deck1, hero1);
			  System.out.println("nbCarteInDeck : " + deck1.nbDeckCard);
			  System.out.println("nbCarteInHand : " + handPlayer1.size());
			  System.out.println("lifeHero : " + hero1.lifePoint);
			  i++;
		}
	  }
}
