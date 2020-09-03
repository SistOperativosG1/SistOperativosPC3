
package Sistema;

import Clases.Proceso;
import java.util.ArrayList;

public class Politicas {

    public Proceso FCFS(ArrayList<Proceso> ColaList) {

        return ColaList.get(0);
    }

    public Proceso RR(ArrayList<Proceso> ColaList) {

        return ColaList.get(0);
    }

    public Proceso Prioridades(ArrayList<Proceso> ColaList) {
        int mayor = 0;
        int idmayor = 0;
        for (Proceso p : ColaList) {

            if (p.getPrioridad() > mayor) {
                mayor = p.getPrioridad();
                idmayor = p.getId();
            }

        }

        for (Proceso p : ColaList) {

            if (p.getId() == idmayor) {
                System.out.println(" proceso con mayor prioridad : " + p.getId() + "  // prioridad : " + p.getPrioridad() + ColaList);
                return p;
            }
        }

        return null;
    }

    public Proceso SJF(ArrayList<Proceso> ColaList) {
        int menor = 10000;
        int idmenor = 0;
        for (Proceso p : ColaList) {

            if (p.getBurstTime() < menor) {
                menor = p.getBurstTime();
                idmenor = p.getId();
            }
        }

        for (Proceso p : ColaList) {

            if (p.getId() == idmenor) {
                System.out.println("menor proceso: " + p.id + "  // burstime: " + p.burstTime + ColaList);
                return p;
            }
        }
        return null;
    }
}
