/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acdefender;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author ankat
 */
public class DefenderFrame extends JFrame implements ConstantesDefender {
    // constantes de la fenêtre :
    private int frame_Width = FRAME_WIDTH ;
    private int frame_Height =  FRAME_HEIGHT ;
    private String titre = TITRE ;
    
    // variables d'instances des objects du jeu :
    
    
    // le panneau :
    private DefenderPanel defenderPan = new DefenderPanel();
    
    private JButton quitter = new JButton("Quitter");

    
    public DefenderFrame() {
        init() ; // initialise les objects
        

        // composants graphiques :
        this.setContentPane(defenderPan);
        
        
        // la fenêtre :
        this.pack(); // prend la taille de ses composants
        this.setTitle(titre);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        
        
    } // fin constructeur

    private void init() {
        quitter.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent arg0) {
        System.exit(0);
      }     
    });
        defenderPan.add(quitter);
        // TODO
    } // fin méthode init()
    
    public void start() {
        // TODO
    } // fin méthode start
    
    public void shutDown() {
        // TODO
    } // fin méthode shutDown
    
    
    
    
} // fin classe DefenderFrame
