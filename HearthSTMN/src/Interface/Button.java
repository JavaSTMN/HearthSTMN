package Interface;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

import Jeu.Main;

import javax.swing.JButton;

public class Button extends JButton {
	  private String name;
	  private Image img;
	  
	  public Button(String str) {
		  super(str);
		    this.name = str;
		    try {
		      img = ImageIO.read(new File("fondbouton.png"));
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		    this.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					System.out.println("FIN DE TOUR !!!!!!!");
					if (Main.playerTurn == 0) {
						Main.playerTurn = 1;
					} else {
						Main.playerTurn = 0;
					}
					try {
						Main.play(Main.player1, Main.player2);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}		
			});
	}

	public void paintComponent(Graphics g){
	    Graphics2D g2d = (Graphics2D)g;
	    g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	    g2d.setColor(Color.black);
	    g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth() / 2 /4), (this.getHeight() / 2) + 5);
	  }

}
