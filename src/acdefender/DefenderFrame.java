/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acdefender;

import java.awt.Dimension;
import javax.swing.JFrame;

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
        // TODO
    } // fin méthode init()
    
    public void start() {
        // TODO
    } // fin méthode start
    
    public void shutDown() {
        // TODO
    } // fin méthode shutDown
    
    
    
    
} // fin classe DefenderFrame
