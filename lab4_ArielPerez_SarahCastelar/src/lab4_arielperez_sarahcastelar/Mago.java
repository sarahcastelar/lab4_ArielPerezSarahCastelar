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
        Object [][]temporal = new Object [10][10];
        
        if (Math.abs(xposPieza-xposMover) == Math.abs(yposPieza-yposMover) || ((xposPieza == xposMover && yposPieza-1 == yposMover) || (xposPieza == xposMover && yposPieza+1 == yposMover))
                || (xposPieza-1 == xposMover && yposPieza == yposMover) || (xposPieza+1 == xposMover && yposPieza == yposMover)) {
            temporal[xposPieza][yposPieza] = mat[xposPieza][yposPieza];
                mat[xposPieza][yposPieza] = null;
                mat[xposMover][yposMover] = temporal[xposPieza][yposPieza];
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (mat[i][j] == (null)) {
                    System.out.print("[" + " " + "]");
                } else if (mat[i][j] instanceof Caballeros) {
                    System.out.print("[" + "C" + "]");
                } else if (mat[i][j] instanceof Dragon) {
                    System.out.print("[" + "F" + "]");
                } else if (mat[i][j] instanceof Duendes) {
                    System.out.print("[" + "D" + "]");
                } else if (mat[i][j] instanceof Arquero) {
                    System.out.print("[" + "A" + "]");
                } else if (mat[i][j] instanceof Rey) {
                    System.out.print("[" + "R" + "]");
                } else if (mat[i][j] instanceof Mago) {
                    System.out.print("[" + "M" + "]");
                } 
            }
            System.out.println();
        }
        
        
        
    }
}//fin de la clase
