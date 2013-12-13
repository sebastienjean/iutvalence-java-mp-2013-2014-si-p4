package fr.iutvalence.java.mp.hanged;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 * @author pascallo
 *
 */
public class Window extends JFrame {


    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /**
     * Create a nex button 'bouton_newGame'
     */
    private final JButton bouton_newGame = new JButton("Nouvelle Partie !");
    /**
     * Create a nex button 'bouton_Exit'
     */
    private final JButton bouton_Exit = new JButton("Quitter le jeu...");


    /**
     * Constructor
     */

    public Window(){
        //
        this.setTitle("Le jeu du Pendu !");
        this.setSize(400, 70);
        this.setLocationRelativeTo(null);               

        JPanel pan = new JPanel();
        //Définition of the background color
        pan.setBackground(Color.ORANGE);        
        this.setContentPane(pan);               
        this.setVisible(true);

        //Button
        pan.add(this.bouton_newGame);
        pan.add(this.bouton_Exit);
        this.setContentPane(pan);
        this.setVisible(true);
        //Define the button action
        this.bouton_newGame.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                new GetAndDisplay().newGame();
                //this.dispose();
            }
        });
        
        this.bouton_Exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                //system.exit(0);
            }
        });
    }
}
