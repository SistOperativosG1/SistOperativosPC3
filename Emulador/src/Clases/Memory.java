
package Clases;


public class Memory {
    private Integer Tamaño;
    private MemoryAddress[] Memoria;

    public Memory(Integer Tamaño, MemoryAddress[] Memoria) {
        this.Tamaño = Tamaño;
        this.Memoria = Memoria;
    }

    public Integer getTamaño() {
        return Tamaño;
    }

    public void setTamaño(Integer Tamaño) {
        this.Tamaño = Tamaño;
    }

    public MemoryAddress[] getMemoria() {
        return Memoria;
    }

    public void setMemoria(MemoryAddress[] Memoria) {
        this.Memoria = Memoria;
    }
    
    
}
