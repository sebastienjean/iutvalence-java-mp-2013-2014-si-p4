package fr.iutvalence.java.mp.hanged;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.BorderLayout;



public class Panel extends JPanel {

	public void paintComponent(Graphics g){
		
		Font font = new Font("Courier", Font.BOLD, 20);
		g.setFont(font);
		g.drawString("Bonjour et bienvenue dans le jeu du pendu !", 10, 20);


		//Image
		    this.add(new JLabel(new ImageIcon("/users/dut/info/pascallo/Images/pendu11.gif")),BorderLayout.CENTER);
//			Image img = ImageIO.read(new File("/users/dut/info/pascallo/Images/pendu11.gif"));
			//g.drawImage(img, 10, 30,800,600, this);
			JTextArea texte = new JTextArea( "Vous avez 6 chances pour trouver le mot caché.");
			//Pour une image de fond
			//g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		

	}               
}
