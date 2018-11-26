package Interface;

import Interface.Button;
import java.io.IOException;

import javax.swing.JFrame;



public class Interface extends JFrame {
	public Interface() throws IOException {
		this.setTitle("HearthSTMN"); // titre de la fenetre
		this.setSize(1920, 1080); // Dimention de la fenetre
		this.setLocation(0, 0); // Fait apparaitre la fenêtre sur la gauche de l'écran
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Quitte le programme après l'appuis sur la croix rouge
		//this.setUndecorated(true); // Fait disparaitre les boutons de contrôle 
		
		Button button = new Button("EXIT");
		
		BackGround background = new BackGround();
		
		background.add(button);
		
		this.setContentPane(background); // Défini JPanel comme contenu à afficher
		this.setVisible(true); // Demande à la fenêtre
	}
}