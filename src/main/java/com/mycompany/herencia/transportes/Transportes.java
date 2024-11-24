
package com.mycompany.herencia.transportes;

/**
 *
 * @author Norlin Lara
 */
public class Transportes {
    
    private String nombreTransporte;
    private String tipoMotor;
    private Integer cantidadControles;
    private Integer cantidadPilotos;
    private String color;

    public Transportes(String nombreTransporte, String tipoMotor, Integer cantidadControles, Integer cantidadPilotos, String color) {
        this.nombreTransporte = nombreTransporte;
        this.tipoMotor = tipoMotor;
        this.cantidadControles = cantidadControles;
        this.cantidadPilotos = cantidadPilotos;
        this.color = color;
    }

    public String getNombreTransporte() {
        return nombreTransporte;
    }

    public void setNombreTransporte(String nombreTransporte) {
        this.nombreTransporte = nombreTransporte;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public Integer getCantidadControles() {
        return cantidadControles;
    }

    public void setCantidadControles(Integer cantidadControles) {
        this.cantidadControles = cantidadControles;
    }

    public Integer getCantidadPilotos() {
        return cantidadPilotos;
    }

    public void setCantidadPilotos(Integer cantidadPilotos) {
        this.cantidadPilotos = cantidadPilotos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    

    
    
    
}
