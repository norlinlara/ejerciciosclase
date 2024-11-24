
package com.mycompany.herencia.transportes;

/**
 *
 * @author Norlin Lara
 */
public class Terrestres extends Transportes{
    
    private Integer velocidadMaximaTerrestre; 

    public Terrestres(Integer velocidadMaximaTerrestre, String nombreTransporte, String tipoMotor, Integer cantidadControles, Integer cantidadPilotos, String color) {
        super(nombreTransporte, tipoMotor, cantidadControles, cantidadPilotos, color);
        this.velocidadMaximaTerrestre = velocidadMaximaTerrestre;
    }

    


    public Integer getVelocidadMaximaTerrestre() {
        return velocidadMaximaTerrestre;
    }

    public void setVelocidadMaximaTerrestre(Integer velocidadMaximaTerrestre) {
        this.velocidadMaximaTerrestre = velocidadMaximaTerrestre;
    }
    
        
    
}
