/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_arielperez_sarahcastelar;

/**
 *
 * @author ariel
 */
public class Caballeros extends Pieza{
    
    
    public void mover(String coordenadaPieza, String coordenadaMover, Object [][] mat){
    String posPieza [] = coordenadaPieza.split(",");
        String posMover [] = coordenadaMover.split(",");
        String xpp = posPieza[0], ypp = posPieza[1], xpm = posMover[0], ypm = posMover[1];
        int xposPieza = Integer.parseInt(xpp), yposPieza = Integer.parseInt(ypp), xposMover = Integer.parseInt(xpm), yposMover = Integer.parseInt(ypm);
        Object [][] temporal = new Object [10][10];
        
        if ( ((xposPieza == xposMover && yposPieza-1 == yposMover) || (xposPieza == xposMover && yposPieza+1 == yposMover))
                || (xposPieza-1 == xposMover && yposPieza == yposMover) || (xposPieza+1 == xposMover && yposPieza == yposMover) ){ //AQUI SE MUEVE VERTICAL HORIZONTAL.
            
            temporal[xposPieza][yposPieza] = mat[xposPieza][yposPieza];
            mat[xposPieza][yposPieza] = null;
            mat[xposMover][yposMover] = temporal[xposPieza][yposPieza];
        }
        
        }
        
    
    
    
    
    
    
    
}//fin de la clase
