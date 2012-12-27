/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acdefender;

import javax.swing.ImageIcon;

/**
 *
 * @author ankat
 */
public class Monstres {
    
    private int posXMonstres ;
    private int posYMonstres ;
    
    private final ImageIcon imageMonstres = new ImageIcon("Monstre60*96.png") ;
    
    public Monstres(){
        // TODO
    }
    
    //--------------------------------------------------------------------------
    //                          GETTERS AND SETTERS
    //--------------------------------------------------------------------------

    public int getPosXMonstres() {
        return posXMonstres;
    }

    public int getPosYMonstres() {
        return posYMonstres;
    }

    public void setPosXMonstres(int posXMonstres) {
        this.posXMonstres = posXMonstres;
    }

    public void setPosYMonstres(int posYMonstres) {
        this.posYMonstres = posYMonstres;
    }
    
    
    
    
} // fin classe Monstres
