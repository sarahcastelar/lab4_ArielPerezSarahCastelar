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
public class LaException extends Exception {

    private Color color;

    public LaException(Color color, String message, Throwable cause) {
        super(message, cause);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "LaException{" + "color=" + color + '}';
    }

}//fin de la clase
