
package Clases;


public class DispositivoES {

    public int id;
    public String estado;
    public int tiempoRestante;
    public int idproc;

    public DispositivoES(int id) {
        this.id = id;
        this.estado = "libre";
        this.tiempoRestante = 0;
        this.idproc = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public void setTiempoRestante(int tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
    }

}
