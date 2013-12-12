package fr.iutvalence.java.mp.hanged;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Panel extends JPanel {

	public void paintComponent(Graphics g){
		
		Font font = new Font("Courier", Font.BOLD, 20);
		g.setFont(font);
		g.drawString("Bonjour et bienvenue dans le jeu du pendu !", 10, 20);


		//Image
		try {
			Image img = ImageIO.read(new File("C:\\Users\\Loïc PASCAL\\Pictures\\accueil2.jpg"));
			g.drawImage(img, 10, 30,800,600, this);
			//Pour une image de fond
			//g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}               
}
