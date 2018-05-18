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
public class Jugador {
    
    private String nombre;
    private String usuario;
    private double puntos;
    private String lugar;
    private int edad;
    private String Sexo;

    public Jugador() {
    }
    
    public Jugador(String nombre, String usuario, double puntos, String lugar, int edad, String Sexo) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.puntos = puntos;
        this.lugar = lugar;
        this.edad = edad;
        this.Sexo = Sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", usuario=" + usuario + ", puntos=" + puntos + ", lugar=" + lugar + ", edad=" + edad + ", Sexo=" + Sexo + '}';
    }
}//fin de la clase
