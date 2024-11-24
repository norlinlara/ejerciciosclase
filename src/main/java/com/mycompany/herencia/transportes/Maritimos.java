
package com.mycompany.herencia.transportes;

/**
 *
 * @author Norlin Lara
 */
public class Maritimos extends Transportes{
    
    private Integer velocidadMaximaMaritima;

    public Maritimos(Integer velocidadMaximaMaritima, String nombreTransporte, String tipoMotor, Integer cantidadControles, Integer cantidadPilotos, String color) {
        super(nombreTransporte, tipoMotor, cantidadControles, cantidadPilotos, color);
        this.velocidadMaximaMaritima = velocidadMaximaMaritima;
    }

    public Integer getVelocidadMaximaMaritima() {
        return velocidadMaximaMaritima;
    }

    public void setVelocidadMaximaMaritima(Integer velocidadMaximaMaritima) {
        this.velocidadMaximaMaritima = velocidadMaximaMaritima;
    }

    
    
    
}
