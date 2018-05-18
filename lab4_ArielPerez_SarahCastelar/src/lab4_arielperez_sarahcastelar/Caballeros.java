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
    
    
    public void mover(){
    
    }
    
    static char [][] moverAtacante(char [][] mat, String coordenadaPieza, String coordenadaMover){
        String posPieza [] = coordenadaPieza.split(",");
        String posMover [] = coordenadaMover.split(",");
        String xpp = posPieza[0], ypp = posPieza[1], xpm = posMover[0], ypm = posMover[1];
        int xposPieza = Integer.parseInt(xpp), yposPieza = Integer.parseInt(ypp), xposMover = Integer.parseInt(xpm), yposMover = Integer.parseInt(ypm);
        
    //1,2 solo se puede mover en la fila 1 o solo se puede mover en la columna 2 
                if ((xposPieza == xposMover)){
                    mat[xposPieza][yposPieza] = '_';
                    mat[xposMover][yposMover] = '*';
                }else if ( (yposPieza == yposMover)){
                    mat[xposPieza][yposPieza] = '_';
                    mat[xposMover][yposMover] = '*';
                }else
                    System.out.println("solo puede moverse derecho, sin subirse sobre ninguna pieza.");
        return mat;
    }
    
    
    
    
}//fin de la clase
