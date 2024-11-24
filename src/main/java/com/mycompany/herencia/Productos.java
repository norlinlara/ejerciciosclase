
package com.mycompany.herencia;

/**
 *
 * @author Norlin Lara
 */
public class Productos {
    
    private String electronico;
    private String marca;  
    private String color; 

    public Productos(String electronico, String marca, String color) {
        this.electronico = electronico;
        this.marca = marca;
        this.color = color;
    }

    public String getElectronico() {
        return electronico;
    }

    public void setElectronico(String electronico) {
        this.electronico = electronico;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
