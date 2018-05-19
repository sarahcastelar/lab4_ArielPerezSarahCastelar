/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_arielperez_sarahcastelar;

import java.awt.Color;

/**
 *
 * @author ariel
 */
public abstract class Pieza {
    
     private Color color;
     
     
     
    public abstract void mover(String coordenadaPieza, String coordenadaMover, Object [][] mat);
   
   // public abstract void comer();
    
    
}//fin de la clase
