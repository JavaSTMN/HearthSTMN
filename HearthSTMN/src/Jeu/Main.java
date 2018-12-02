package Jeu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;

import Interface.Interface;
import Interface.Menu;


public class Main {
	public static int endTurn = 0;
	public static int playerTurn = 0;
	public static boolean endGame = false;
	public static Status player1;
	public static Status player2;
	
	  public static void main(String[] args) throws IOException {	  
		  Menu menu = new Menu();
		  menu.setVisible(true);
	  } 
	  
	  public static void initGame() throws IOException {	  
		  player1 = new Status();
		  System.out.println("Hero1 : " + player1.hero.lifePoint);
		  player2 = new Status();
		  System.out.println("Hero2 : " + player1.hero.lifePoint);
		  Interface inter = new Interface();
		  play(player1, player2);
	  }

	  public static void play(Status player1, Status player2) throws IOException {
		  Status player;
		  Status Oplayer;
		  System.out.println("playerTurn" + playerTurn);
		  if (playerTurn == 0) {
			 player = player1;
			 Oplayer = player2;
			 System.out.println("je suis player 1");
		  } else {
			 player = player2;
			 Oplayer = player1;
			 System.out.println("je suis player 2");
		  }		  
		  
		  
		  
		  
		  Hand.verifHand(player.handPlayer, player.hand, player.deckPlayer, player.deck, player.hero);
		  player.mana.increase();
		  System.out.println("Hero : " + player.hero.lifePoint);
		  System.out.println("nbCardDeck :" + player.deck.nbDeckCard);
		  System.out.println("nbCardHand : " + player.hand.nbCard);
		  System.out.println("mana : " + player.mana.currentMana); 
		  
		  Interface.labelManaCurrentPlayer.setText( "Mana : " + player.mana.currentMana + "/" + player.mana.overallMana);
		  Interface.nbCardDeckCurrentPlayer.setText( "Deck : " + player.deck.nbDeckCard);
		  Interface.hpHeroCurrentPlayer.setText( "Hero : " + player.hero.lifePoint);
		  
		  Interface.labelManaOtherPlayer.setText( "Mana : " + Oplayer.mana.overallMana);
		  Interface.nbCardDeckOtherPlayer.setText( "Deck : " + Oplayer.deck.nbDeckCard);
		  Interface.hpHeroManaOtherPlayer.setText( "Hero : " + Oplayer.hero.lifePoint);
		  	  
	  }	 
}
