package Interface;

import Interface.Button;
import Jeu.Main;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interface extends JFrame {
	public static Button btEndTurn;
	public static JLabel labelManaCurrentPlayer;
	public static JLabel labelManaOtherPlayer;
	public static JLabel hpHeroCurrentPlayer;
	public static JLabel hpHeroManaOtherPlayer;
	public static JLabel nbCardDeckCurrentPlayer;
	public static JLabel nbCardDeckOtherPlayer;
	
	public Interface() throws IOException {
		this.setTitle("HearthSTMN"); // titre de la fenetre
		this.setSize(1920, 1080); // Dimention de la fenetre
		this.setLocation(0, 0); // Fait apparaitre la fenêtre sur la gauche de l'écran
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Quitte le programme après l'appuis sur la croix rouge
		//this.setUndecorated(true); // Fait disparaitre les boutons de contrôle 
		
		btEndTurn = new Button("Fin de tour");
		labelManaCurrentPlayer = new JLabel();
		labelManaOtherPlayer = new JLabel();
		hpHeroCurrentPlayer  = new JLabel();;
		hpHeroManaOtherPlayer  = new JLabel();;
		nbCardDeckCurrentPlayer  = new JLabel();;
		nbCardDeckOtherPlayer  = new JLabel();;
		
		BackGround background = new BackGround();
		background.BackGroundInterface();
		
		background.add(btEndTurn);
		background.add(labelManaCurrentPlayer);
		background.add(labelManaOtherPlayer);
		background.add(hpHeroCurrentPlayer);
		background.add(hpHeroManaOtherPlayer);
		background.add(nbCardDeckCurrentPlayer);
		background.add(nbCardDeckOtherPlayer);
		
		this.setContentPane(background); // Défini JPanel comme contenu à afficher
		this.setVisible(true); // Demande à la fenêtre
	}
}