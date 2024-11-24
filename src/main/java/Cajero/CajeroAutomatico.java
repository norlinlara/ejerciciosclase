
package Cajero;

/**
 *
 * @author hi
 */
public class CajeroAutomatico {
    
    private String cantidadRetiro; 
    private String ubicacionCajero; 

    public CajeroAutomatico(String cantidadRetiro, String ubicacionCajero) {
        this.cantidadRetiro = cantidadRetiro;
        this.ubicacionCajero = ubicacionCajero;
    }

    public String getCantidadRetiro() {
        return cantidadRetiro;
    }

    public void setCantidadRetiro(String cantidadRetiro) {
        this.cantidadRetiro = cantidadRetiro;
    }

    public String getUbicacionCajero() {
        return ubicacionCajero;
    }

    public void setUbicacionCajero(String ubicacionCajero) {
        this.ubicacionCajero = ubicacionCajero;
    }
    
    
}
