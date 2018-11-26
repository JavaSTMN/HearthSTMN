package Interface;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class BackGround extends JPanel
{
    // The Image to store the background image in.
    
	BufferedImage img;
	
	BackGround() {
		setOpaque(false);
		setLayout(new GridBagLayout());
	}
	
    public void BackGroundInterface() throws IOException
    {
        // Loads the background image and stores in img object.
    	img = ImageIO.read(new File("background.png"));
    }
    
    public void BackGroundMenu() throws IOException
    {
        // Loads the background image and stores in img object.
    	img = ImageIO.read(new File("menu.jpg"));
    }

    public void paint(Graphics g)
    {
        // Draws the img to the BackgroundPanel.
        //
    	g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    	super.paint(g);
    	
    	
    	
    }
}
