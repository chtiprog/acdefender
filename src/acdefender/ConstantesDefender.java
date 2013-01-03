/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acdefender;

/**
 * Interface contenant les constantes du jeu
 * @author ankat
 */
public interface ConstantesDefender {
    
    static final int FRAME_WIDTH = 800 ;
    static final int FRAME_HEIGHT = 600 ;
    static String TITRE = "AC DEFENDER" ;
    
    static final boolean DEBUG = false;
    
    static final int TAILLE_BULLET = 20 ;
    static final int X_DEPART_BULLET = 0 ;
    static final int Y_DEPART_BULLET = (FRAME_HEIGHT / 2) - TAILLE_BULLET ;
    
}
