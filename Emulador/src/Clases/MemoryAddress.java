
package Clases;


public class MemoryAddress {
    private Integer direccion;
    private Proceso proceso;

    public MemoryAddress(Integer direccion, Proceso proceso) {
        this.direccion = direccion;
        this.proceso = proceso;
    }

    public Integer getDireccion() {
        return direccion;
    }

    public void setDireccion(Integer direccion) {
        this.direccion = direccion;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }
    
}

