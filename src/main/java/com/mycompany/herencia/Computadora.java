
package com.mycompany.herencia;

/**
 *
 * @author NorlinLara
 */
public class Computadora extends Productos {
    
    private String pantalla;

    public Computadora(String pantalla, String electronico, String marca, String color) {
        super(electronico, marca, color);
        this.pantalla = pantalla;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }
    
    
}
