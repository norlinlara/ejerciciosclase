
package com.mycompany.herencia;

/**
 *
 * @author Norlin Lara
 */
public class AireAcondicionado extends Productos{
    
    private Integer CapacidadBtu;

    public AireAcondicionado(Integer CapacidadBtu, String electronico, String marca, String color) {
        super(electronico, marca, color);
        this.CapacidadBtu = CapacidadBtu;
    }

    public Integer getCapacidadBtu() {
        return CapacidadBtu;
    }

    public void setCapacidadBtu(Integer CapacidadBtu) {
        this.CapacidadBtu = CapacidadBtu;
    }

    
    
    
    
}
