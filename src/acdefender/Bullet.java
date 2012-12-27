/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acdefender;

/**
 *
 * @author ankat
 */
public class Bullet {
    
    final int posXDepartBullet = 0 ;
    final int posYDepartBullet = (600 / 2 ) - 20 ;
    final int tailleBullet = 20 ;
    private int posXBullet ;
    private int posYBullet ;
    
    public Bullet(){
        // TODO
    }
    
    //--------------------------------------------------------------------------
    //                      GETTERS AND SETTERS
    //--------------------------------------------------------------------------

    public int getPosXBullet() {
        return posXBullet;
    }

    public int getPosYBullet() {
        return posYBullet;
    }

    public void setPosXBullet(int posXBullet) {
        this.posXBullet = posXBullet;
    }

    public void setPosYBullet(int posYBullet) {
        this.posYBullet = posYBullet;
    }
    
    
    
    
} // fin classe Bullet
