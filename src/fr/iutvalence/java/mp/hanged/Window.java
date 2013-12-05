package fr.iutvalence.java.mp.hanged;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 * @author pascallo
 *
 */
public class Window extends JFrame {
    
    
    private JPanel pan = new JPanel();
    
    private JButton bouton = new JButton("Nouvelle Partie !");
    /**
     * Constructor
     */
    public Window(){
        //
        this.setTitle("Le pendu !");
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        this.setLocation(20, 80);
        this.setResizable(false);
        //this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
        this.setVisible(true);
        //
        pan.setBackground(Color.pink);
        this.setContentPane(pan);               
        this.setVisible(true);
        //
        
        pan.add(bouton);
        
    }
    
    public void paintComponent(Graphics g){
        g.drawString("Bonjour et bienvenu sur le jeu du pendu !", 10, 20);
      } 
}
