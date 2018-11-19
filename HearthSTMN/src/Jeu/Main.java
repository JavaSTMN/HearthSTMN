package Jeu;

import java.util.ArrayList;

public class Main {
	  public static void main(String[] args){  
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
		  System.out.println("Main j1");
		  System.out.println((handPlayer2.get(0)).cardName);
		  System.out.println((handPlayer2.get(1)).cardName);
		  System.out.println((handPlayer2.get(2)).cardName);
		  
		  handPlayer1.add(hand1.draw(deckPlayeur1, deck1));
		  System.out.println((handPlayer1.get(3)).cardName);
		  System.out.println("deck j1");
		  System.out.println(deck1.nbDeckCard);
		  
		  
		  
	  } 
	
}
