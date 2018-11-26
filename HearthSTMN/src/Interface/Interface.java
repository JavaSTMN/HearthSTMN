package Interface;

import Interface.Button;
import java.io.IOException;

import javax.swing.JFrame;



public class Interface extends JFrame {
	public Interface() throws IOException {
		this.setTitle("HearthSTMN"); // titre de la fenetre
		this.setSize(1920, 1080); // Dimention de la fenetre
		this.setLocation(0, 0); // Fait apparaitre la fen�tre sur la gauche de l'�cran
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Quitte le programme apr�s l'appuis sur la croix rouge
		//this.setUndecorated(true); // Fait disparaitre les boutons de contr�le 
		
		Button button = new Button("EXIT");
		
		BackGround background = new BackGround();
		
		background.add(button);
		
		this.setContentPane(background); // D�fini JPanel comme contenu � afficher
		this.setVisible(true); // Demande � la fen�tre
	}
}