
package com.mycompany.herencia;

/**
 *
 * @author hi
 */
public class Audifonos extends Productos{
    
    private String calidadSonido;

    public Audifonos(String calidadSonido, String electronico, String marca, String color) {
        super(electronico, marca, color);
        this.calidadSonido = calidadSonido;
    }

    public String getCalidadSonido() {
        return calidadSonido;
    }

    public void setCalidadSonido(String calidadSonido) {
        this.calidadSonido = calidadSonido;
    }
    
    
}
