package Interface;
import java.awt.Graphics;
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
	
    public BackGround() throws IOException
    {
        // Loads the background image and stores in img object.
    	img = ImageIO.read(new File("background.png"));
    }

    public void paint(Graphics g)
    {
        // Draws the img to the BackgroundPanel.
        //
    	super.paintComponent(g);
    	g.drawImage(img, -25, -10, this.getWidth(), this.getHeight(), this);
    }
}
