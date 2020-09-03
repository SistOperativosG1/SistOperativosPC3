
package Sistema;

import Clases.PCB;
import Clases.Proceso;
import java.util.ArrayList;

public class Interrupcion {

    public boolean nuevoProceso(ArrayList<Proceso> proceso, int time) {
        boolean llegada = false;
        for (Proceso p : proceso) {
            if (time == p.getTiempoArribo()) {
                llegada = true;
                break;
            }
        }
        return llegada;
    }

    
    public boolean InterrupionES(PCB pcb1) {
        boolean interuption = false;
        if ((pcb1.getBurstTime() % pcb1.getPeriodoInterrupcion() == 0) & (pcb1.getBurstTime() != 0)) {
            interuption = true;
        }
        return interuption;
    }
    
}
