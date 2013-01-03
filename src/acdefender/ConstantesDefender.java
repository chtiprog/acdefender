/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acdefender;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 * Interface contenant les constantes du jeu
 * @author ankat
 */
public interface ConstantesDefender {
    // FENETRE DU JEU
    static final int FRAME_WIDTH = 800 ;
    static final int FRAME_HEIGHT = 600 ;
    static String TITRE = "AC DEFENDER" ;
    // POUR DEBUGER
    static final boolean DEBUG = true ;
    // POUR LES BULLETS PRINCIPALEMENT
    static final int TAILLE_BULLET = 20 ;
    static final int X_DEPART_BULLET = 0 ;
    static final int Y_DEPART_BULLET = (FRAME_HEIGHT / 2) - TAILLE_BULLET ;
    static final Color COULEUR_BULLET = Color.GREEN ;
    
    
    
}
