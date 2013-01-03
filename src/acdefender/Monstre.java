/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acdefender;

import java.awt.Graphics;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author ankat
 */
public class Monstre implements Runnable, ConstantesDefender {
    /**
     * Position x du Monstre
     */
    private int posXMonstres ;
    /**
     * Position y du Monstre
     */
    private int posYMonstres ;
    /**
     * Permet la randomisation pour la position y du Monstre
     */
    Random random = new Random();
    /**
     * Image du Monstre
     */
    //private final ImageIcon imageMonstres = new ImageIcon(getClass().getResource("/Monstre60*96.png")) ;
    private final ImageIcon imageMonstres = new ImageIcon(getClass().getResource("/Tux86x100.svg.png"));
    
    
    public Monstre(){
        posXMonstres = 800 ;
        posYMonstres = random.nextInt(550);
    } // fin constructeur
   
    
    /**
     * Méthode permettant de dessiner un Monstre
     * @param g : Graphics, le context graphic
     * @param x : int, position x du Monstre
     * @param y : int, position y du Monstre
     */
    public void drawMonstres(Graphics g, int x, int y){
        if(DEBUG){
            System.out.println("x == " + x + "... y == " + y); // DEBUG
        }
        g.drawImage(imageMonstres.getImage(), x, y, null);
    }
    
    @Override
    public void run() {
        
        /*
        for (int i = FRAME_WIDTH; i > 0; --i) {
                this.posXMonstres-- ;
                
                try {
                    Thread.sleep(5); // Pour poser le programme
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        } // fin for i
        */
        if ( (FRAME_WIDTH - this.posXMonstres) != FRAME_WIDTH ){
            this.posXMonstres-- ;
        }
        if(DEBUG){
            System.out.println("Je suis dans la méthode run de Monstre"); // DEBUG
        }
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
