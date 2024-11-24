
package com.mycompany.herencia.transportes;

/**
 *
 * @author Norlin Lara
 */
public class Aereo extends Transportes{
    
    private Integer velocidadMaximaAerea;

    public Aereo(Integer velocidadMaximaAerea, String nombreTransporte, String tipoMotor, Integer cantidadControles, Integer cantidadPilotos, String color) {
        super(nombreTransporte, tipoMotor, cantidadControles, cantidadPilotos, color);
        this.velocidadMaximaAerea = velocidadMaximaAerea;
    }

    
    public Integer getVelocidadMaximaAerea() {
        return velocidadMaximaAerea;
    }

    public void setVelocidadMaximaAerea(Integer velocidadMaximaAerea) {
        this.velocidadMaximaAerea = velocidadMaximaAerea;
    }
    
    
            
    
}
