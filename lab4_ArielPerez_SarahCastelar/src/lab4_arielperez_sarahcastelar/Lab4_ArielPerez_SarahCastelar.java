
package lab4_arielperez_sarahcastelar;

import javax.swing.JOptionPane;


public class Lab4_ArielPerez_SarahCastelar {

    
    public static void main(String[] args) {
        
        int option = -1, option2 = -1;
        
        while (option != 3){
            option = Integer.parseInt(JOptionPane.showInputDialog(
                  "1. Crear creadores\n"
                + "2. INICIO\n"
                + "3. Salir\n"));
            
            
            
            if (option == 1) { //AGREGAR ELIMINAR Y LISTAR JUGADORES
                
                option2 = Integer.parseInt(JOptionPane.showInputDialog(
                  "1. Agregar Nuevo Jugador\n"
                + "2. Eliminar Juagador\n"
                + "3. Enlistar Jugadores\n"));
                
                if (option2 == 1) {
                    
                }
                if (option2 == 2) {
                    
                }
                if (option2 == 3) {
                    
                }
            }
        }
        
    }
    
    
    
    
    
    static void imprimeMatriz(char mat [][], int filas, int cols){
        if (filas == mat.length-1 && cols == mat[0].length-1) {
            System.out.println("[" + mat[filas][cols] + "]");
            System.out.println();
        } else {
            if (cols == mat[0].length-1) {
                System.out.println("[" + mat[filas][cols] + "]");
                imprimeMatriz(mat, filas+1,0);
            } else {
                System.out.print("[" + mat[filas][cols] + "]");
                imprimeMatriz(mat,filas,cols+1);
            }
        }
    }
    
}
