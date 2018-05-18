
package lab4_arielperez_sarahcastelar;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Lab4_ArielPerez_SarahCastelar {

    
    public static void main(String[] args) {
        try{
        int option = -1, option2 = -1;
        
        //agregar nuevo jugador
        ArrayList jugadores = new ArrayList();
        int contJugadores = 0;
        
        //option2
        Object mat [][] = new Object [11][11];
        
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
                    if (contJugadores < 2) {
                        String nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
                        String usuario = JOptionPane.showInputDialog("Ingrese usuario: ");
                        String lugar = JOptionPane.showInputDialog("Ingrese lugar: ");
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad: "));
                        String sexo = JOptionPane.showInputDialog("Ingrese sexo: [f/m] ");
                        jugadores.add(new Jugador(nombre, usuario, 0, lugar, edad, sexo));
                        contJugadores++;
                    }else
                        System.out.println("solo se pueden tener 2 jugadores por partido. ");
                    
                    
                    
                }
                if (option2 == 2) {
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion de jugador a eliminar: "));
                    jugadores.remove(pos);
                }
                if (option2 == 3) {
                    for (Object t : jugadores) {
                        System.out.println(t + "\n");
                    } 
                }
            }//option 1
            
            if (option == 2) { //iniciar juego
                //imprimir matriz.
                
                mat[0][0]='C';
                mat[0][2]='f';
                mat[0][3]='A';
                mat[0][4]='R';
                mat[0][5]='M';
                mat[0][6]='A';
                mat[0][7]='F';
                mat[0][9]='C';
                
                mat[1][0]='D';
                mat[1][2]='A';
                mat[1][3]='D';
                mat[1][4]='C';
                mat[1][5]='F';
                mat[1][6]='D';
                mat[1][7]='A';
                mat[1][9]='D';
                
                mat[8][0] = 'd';
                mat[8][2] = 'a';
                mat[8][3] = 'd';
                mat[8][4] = 'f';
                mat[8][5] = 'c';
                mat[8][6] = 'd';
                mat[8][7] = 'a';
                mat[8][9] = 'd';
                
                mat[9][0] = 'c';
                mat[9][2] = 'f';
                mat[9][3] = 'a';
                mat[9][4] = 'm';
                mat[9][5] = 'r';
                mat[9][6] = 'a';
                mat[9][7] = 'f';
                mat[9][9] = 'c';
                
                imprimirMatriz(mat);
            }
        }
        
    } catch (Exception e){
        
    }//fin try catch
    
    }
    //JUGADOR VA SER MAYUS
    //OPONENTE MINUS
    
    
    
    static void imprimirMatriz(Object [][] mat){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (mat[i][j] == (null)) {
                     System.out.print("[" + " " + "]");
                }else 
                    System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println();
        }
        
    }
    
    
    
}
