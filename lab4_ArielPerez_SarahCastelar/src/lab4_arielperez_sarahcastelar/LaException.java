
package lab4_arielperez_sarahcastelar;

import java.awt.Color;


public class LaException extends Exception {

    private Color color;

    public LaException(Color color, String message) {
        super(message);
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
