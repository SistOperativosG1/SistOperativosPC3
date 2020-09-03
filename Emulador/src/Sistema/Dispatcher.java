
package Sistema;

import Clases.Proceso;
import Clases.PCB;
import java.sql.SQLException;

public class Dispatcher {
    public Proceso guardar(PCB pcb) throws SQLException{
        Proceso p=new Proceso(0);
        p.setId(pcb.getId());
        p.setBurstTime(pcb.getBurstTime());
        p.setEstado(pcb.getEstado());
        p.setPrioridad(pcb.getPrioridad());
        p.setPC(pcb.getPC());
        
        return p;
    }
    
     public PCB cargar(Proceso p,PCB pcb){
        pcb.setId(p.getId());
        pcb.setBurstTime(p.getBurstTime());
        pcb.setEstado("Listo");
        pcb.setInterrupciones(p.getInterrupciones());
        pcb.setPeriodoInterrupcion(p.getPeriodoInterrupcion());
        pcb.setPeso(p.getPeso());
        pcb.setPrioridad(p.getPrioridad());
        pcb.setTiempoArribo(p.getTiempoArribo());
        pcb.setCodError("No error");
        pcb.setPC(p.getPC());
        pcb.setPC(p.getPC());

        return pcb;
    
    }
}
