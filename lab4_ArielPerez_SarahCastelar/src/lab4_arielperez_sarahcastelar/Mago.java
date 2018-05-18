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
public class Mago extends Pieza{
    
    public  void mover(String coordenadaPieza, String coordenadaMover, Object [][] mat){
        String posPieza [] = coordenadaPieza.split(",");
        String posMover [] = coordenadaMover.split(",");
        String xpp = posPieza[0], ypp = posPieza[1], xpm = posMover[0], ypm = posMover[1];
        int xposPieza = Integer.parseInt(xpp), yposPieza = Integer.parseInt(ypp), xposMover = Integer.parseInt(xpm), yposMover = Integer.parseInt(ypm);
        
        
        
        
    }
}//fin de la clase
