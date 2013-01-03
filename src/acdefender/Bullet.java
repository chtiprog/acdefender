/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acdefender;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author ankat
 */
public class Bullet implements Runnable, ConstantesDefender {
    
    private int posXDepartBullet = X_DEPART_BULLET ;
    private int posYDepartBullet = Y_DEPART_BULLET ;
    private int posXBullet ;
    private int posYBullet ;
    
    public Bullet(){
        posXBullet = posXDepartBullet ;
        posYBullet = posYDepartBullet ;
    } // fin constructeur
    
    /**
     * Dessine la Bullet
     * @param g : Graphics, le contexte graphic
     * @param x : int, coordonnées x de la bullet
     * @param y : int, coordonnées y de la bullet
     */
    public void drawBullet(Graphics g, int x, int y){
        
        if(DEBUG){
            System.out.println("x == " + x + "... y == " + y); // DEBUG
        }
        g.setColor(Color.BLUE);
        g.fillOval(x, y, TAILLE_BULLET, TAILLE_BULLET);
        
        
    } // fin méthode drawBullet
    
    
    @Override
    public void run() {
        
    } // fin méthode run
    
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
