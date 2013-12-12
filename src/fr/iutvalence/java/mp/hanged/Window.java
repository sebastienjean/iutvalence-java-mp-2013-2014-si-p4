package fr.iutvalence.java.mp.hanged;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * @author pascallo
 *
 */
public class Window extends JFrame {


	private final JButton bouton = new JButton("Nouvelle Partie !");
	/**
	 * Constructor
	 */
	public Window(){
		//
		this.setVisible(true);
		this.setTitle("Le jeu du pendu !");
		this.setSize(1000, 700);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		//this.setResizable(false);

		//this.setAlwaysOnTop(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Jpanel
		JPanel pan = new JPanel();
		pan.setBackground(Color.pink);
		this.setContentPane(new Panel());
	}
}
