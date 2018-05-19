package lab4_arielperez_sarahcastelar;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab4_ArielPerez_SarahCastelar {

    public static void main(String[] args) {
        try {

            Scanner entrada = new Scanner(System.in);
            int option = -1, option2 = -1;

            //agregar nuevo jugador
            ArrayList jugadores = new ArrayList();
            int contJugadores = 0;

            //option2
            Pieza mat[][] = new Pieza[11][11];
            //Pieza[][] t = new Pieza[10][10];
            mat[0][0] = new Caballeros();
            mat[0][2] = new Caballeros();
            mat[0][3] = new Arquero();
            mat[0][4] = new Rey();
            mat[0][5] = new Mago();
            mat[0][6] = new Arquero();
            mat[0][7] = new Dragon();
            mat[0][9] = new Caballeros();

            mat[1][0] = new Duendes();
            mat[1][2] = new Arquero();
            mat[1][3] = new Duendes();
            mat[1][4] = new Caballeros();
            mat[1][5] = new Dragon();
            mat[1][6] = new Duendes();
            mat[1][7] = new Duendes();
            mat[1][9] = new Duendes();

            mat[8][0] = new Duendes();
            mat[8][2] = new Arquero();
            mat[8][3] = new Duendes();
            mat[8][4] = new Dragon();
            mat[8][5] = new Caballeros();
            mat[8][6] = new Duendes();
            mat[8][7] = new Arquero();
            mat[8][9] = new Duendes();

            mat[9][0] = new Caballeros();
            mat[9][2] = new Dragon();
            mat[9][3] = new Arquero();
            mat[9][4] = new Mago();
            mat[9][5] = new Rey();
            mat[9][6] = new Arquero();
            mat[9][7] = new Dragon();
            mat[9][9] = new Caballeros();

            while (option != 3) {
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
                        } else {
                            System.out.println("solo se pueden tener 2 jugadores por partido. ");
                        }

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
                    int option3 = -1;
                    while (option3 != 1) {
                        imprimirMatriz(mat);
                        System.out.println();

                        System.out.println("Ingrese coordenada de pieza: ");
                        String coordenadaPieza = entrada.next();
                        System.out.println("Ingrese coordenada a mover: ");
                        String coordenadaMover = entrada.next();

                        String posPieza [] = coordenadaPieza.split(",");
                        String posMover[] = coordenadaMover.split(",");
                        String xpp = posPieza[0], ypp = posPieza[1], xpm = posMover[0], ypm = posMover[1];
                        int xposPieza = Integer.parseInt(xpp), yposPieza = Integer.parseInt(ypp), xposMover = Integer.parseInt(xpm), yposMover = Integer.parseInt(ypm);
                        
                            mat[xposPieza][yposPieza].mover(coordenadaPieza, coordenadaMover, mat); 
                            
                            try{
                             validar(xposMover,yposMover);   
                            }catch (LaException e){
                                System.out.println("movimiento invalido. ");
                            }
                            
                            
                        
                    option3 = Integer.parseInt(JOptionPane.showInputDialog("Continua? Si no, ingrese 1"));
                    System.out.println();
                    }

                }
            }

        } catch (Exception e) {
            
        }//fin try catch

    }
    //JUGADOR VA SER MAYUS
    //OPONENTE MINUS

    static void imprimirMatriz(Object[][] mat) {
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
    
    static void validar(int x, int y) throws LaException{
            if ((x<0 || x>10) || (y<0 || y>10)){
                throw new LaException(Color.RED,"No existe esa posicion. ");
            }
        
        
        //cuando la condicion se cumpla lanza la excepcion
    }
}