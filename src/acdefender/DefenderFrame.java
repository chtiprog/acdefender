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
public class DefenderFrame extends JFrame {
    // constantes de la fenêtre :
    static final int FRAME_WIDTH = 800 ;
    static final int FRAME_HEIGHT = 600 ;
    private static String titre = "AC DEFENDER" ;
    
    // variables d'instances des objects du jeu :
    
    
    // le panneau :
    private DefenderPanel defenderPan ;
    
    public DefenderFrame() {
        init() ; // initialise les objects
        
        // composants graphiques :
        defenderPan = new DefenderPanel();
        defenderPan.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
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
