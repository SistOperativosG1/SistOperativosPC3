
package Clases;

import java.util.ArrayList;

public class colaProcesos {
    private ArrayList<Proceso> colaProceso;

    public colaProcesos(ArrayList<Proceso> colaProceso) {
        this.colaProceso = colaProceso;
    }

    public ArrayList<Proceso> getCola_de_procesos() {
        return colaProceso;
    }

    public void setCola_de_procesos(ArrayList<Proceso> cola_de_procesos) {
        this.colaProceso = cola_de_procesos;
    }

    public void NuevoAListo(Integer tick){
        for(int i = 0; i < colaProceso.size(); i++){
            if((colaProceso.get(i).getPulso()) == tick && (colaProceso.get(i).getEstado() == "Nuevo")){
                colaProceso.get(i).setEstado("Listo");
            }
        }
    }
}
