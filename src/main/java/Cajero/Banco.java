/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajero;

/**
 *
 * @author hi
 */
public class Banco {
    
    private String numeroFila; 
    private String idCliente;

    public Banco(String numeroFila, String idCliente) {
        this.numeroFila = numeroFila;
        this.idCliente = idCliente;
    }

    public String getNumeroFila() {
        return numeroFila;
    }

    public void setNumeroFila(String numeroFila) {
        this.numeroFila = numeroFila;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
}
