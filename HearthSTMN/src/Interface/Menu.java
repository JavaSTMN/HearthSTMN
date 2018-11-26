package Interface;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Jeu.Main;

public class Menu extends JFrame{
	public Menu() throws IOException {
		//JFrame menu = new JFrame("HearthSTMN"); // titre de la fenetre	
		setTitle("HearthSTMN");
		setSize(1920, 1080); // Dimention de la fenetre
		setLocation(0, 0); // Fait apparaitre la fenêtre sur la gauche de l'écran
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Quitte le programme après l'appuis sur la croix rouge
	    
		BackGround background = new BackGround();
		background.BackGroundMenu();
	
		ImageIcon imageForPlay = new ImageIcon("menuPlay.png");
		JButton play = new JButton("", imageForPlay);
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				try {
					Main.startGame();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}		
		});
		
		GridBagConstraints gridPlay = new GridBagConstraints();
		gridPlay.gridx = 0;
		gridPlay.gridy = 0;
		
		GridBagConstraints gridExit = new GridBagConstraints();
		gridExit.gridx = 0;
		gridExit.gridy = 1;
		
		ImageIcon imageForExit = new ImageIcon("menuExit.png");
		JButton exit = new JButton("", imageForExit);
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}		
		});

		setContentPane(background);
		background.add(play, gridPlay);
		background.add(exit, gridExit);
		setContentPane(background);

	}
}


    
 