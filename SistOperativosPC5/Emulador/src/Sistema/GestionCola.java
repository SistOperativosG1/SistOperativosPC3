
package Sistema;

import Clases.DispositivoES;
import Clases.Proceso;
import Clases.PCB;
import Aleatorio.Random;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class GestionCola {

    public ArrayList<Proceso> removerDeCola(ArrayList<Proceso> ColaL, PCB pcb) {

        ArrayList<Proceso> Colal2 = new ArrayList<Proceso>();

        for (Proceso p : ColaL) {
            if (p.id != pcb.id) {
                Colal2.add(p);

            }
        }
        return Colal2;

    }

    public ArrayList<Proceso> adminLlegadaColaL(ArrayList<Proceso> process, ArrayList<Proceso> ColaL, int time) {

        for (Proceso p : process) {

            if (time == p.getTiempoArribo()) {

                p.setEstado("Listo");

                ColaL.add(p);

            }

        }

        return ColaL;
    }

    public ArrayList<Proceso> adminColaES(ArrayList<Proceso> ColaES, PCB pcb1) throws SQLException {

        Random r1 = new Random();
        Proceso J = new Proceso(0);
        J.setBurstTime(pcb1.getBurstTime());
        J.setEstado("Bloqueado");
        J.setId(pcb1.getId());
        J.setInterrupciones(pcb1.getInterrupciones());
        J.setPeriodoInterrupcion(pcb1.getPeriodoInterrupcion());
        J.setPeso(pcb1.getPeso());
        J.setPrioridad(pcb1.getPrioridad());
        J.setTiempoArribo(pcb1.getTiempoArribo());
        //Se le asigna la duracion de la interrupcion
        J.setTiempoInterrupcion(r1.uniforme(5, 20));
        J.idDES = r1.Discreta();
        J.setPC(pcb1.getPC());

        ColaES.add(J);

        return ColaES;

    }

    public ArrayList<Proceso> iniTiempoRetornoColaTotal(ArrayList<Proceso> process, ArrayList<Proceso> ColaT, int time) {

        for (Proceso p : process) {

            if (time == p.getTiempoArribo()) {
                p.tiempoRetorno = time;
                ColaT.add(p);

            }

        }

        return ColaT;
    }

    public ArrayList<Proceso> actualizarColaTotalTiempoEspera(ArrayList<Proceso> ColaTotal, PCB pcb) {
        ArrayList<Proceso> ColaTotal1 = new ArrayList();
        for (Proceso process : ColaTotal) {

            if (pcb.id != process.id) {
                process.tiempoEspera++;
            }
            ColaTotal1.add(process);
        }

        return ColaTotal1;
    }

    public ArrayList<Proceso> actualizarColaTotalTiempoRetorno(ArrayList<Proceso> ColaTotal, PCB pcb, int i) {
        ArrayList<Proceso> ColaTotal1 = new ArrayList();
        for (Proceso process : ColaTotal) {

            if (pcb.id == process.id) {
                process.tiempoRetorno = i - process.tiempoRetorno;
            }
            ColaTotal1.add(process);
        }

        return ColaTotal1;

    }

    public ArrayList<Proceso> atenderIntES(ArrayList<Proceso> ColaES) {
        for (Proceso K : ColaES) {

            K.tiempoInterrupcion = K.tiempoInterrupcion - 1;

        }

        return ColaES;
    }

    public ArrayList<Proceso> actualizarColaListos(ArrayList<Proceso> ColaListos1, ArrayList<Proceso> ColaES) {
        for (Proceso S : ColaES) {
            if (S.tiempoInterrupcion == 0) {
                ColaListos1.add(S);

            }
        }

        return ColaListos1;
    }

    public boolean requerimientoListo(ArrayList<Proceso> ColaES) {
        boolean A = false;
        for (Proceso B : ColaES) {
            if (B.tiempoInterrupcion == 0) {
                A = true;
                break;

            }
        }
        return A;
    }

    public ArrayList<Proceso> actualizarColaTotal(ArrayList<Proceso> ColaT, PCB pcb) {
        ArrayList<Proceso> Cola1 = new ArrayList<Proceso>();
        for (Proceso p : ColaT) {

            if (p.id == pcb.id) {
                p.burstTime = pcb.burstTime;
                p.codError = pcb.codError;
                p.estado = "finalizado";
            }
            Cola1.add(p);
        }
        return Cola1;
    }

    public ArrayList<Proceso> actualizarColaES(JTextField ProcesoES1, JTextField ProcesoES2, JTextField ProcesoES3, JTextField ProcesoES4, JTextField ProcesoES5, JProgressBar jProgressBar31, JProgressBar jProgressBar32, JProgressBar jProgressBar33, JProgressBar jProgressBar34, JProgressBar jProgressBar35, ArrayList<Proceso> ColaES, ArrayList<DispositivoES> DES) {
        ArrayList<Proceso> ColaES2 = new ArrayList<Proceso>();
        int a = 1, b = 2, c = 3, d = 4, e = 5;

        for (Proceso p : ColaES) {
            for (DispositivoES des : DES) {

                if (a == des.id & des.id == p.idDES) {
                    p.tiempoInterrupcion = p.tiempoInterrupcion - 1;
                    ProcesoES1.setText("proceso..." + p.id);
                    jProgressBar31.setValue(p.tiempoInterrupcion);
                    jProgressBar31.repaint();
                    a = 0;
                }

                if (b == des.id & des.id == p.idDES) {
                    ProcesoES2.setText("proceso..." + p.id);
                    p.tiempoInterrupcion = p.tiempoInterrupcion - 1;
                    jProgressBar32.setValue(p.tiempoInterrupcion);
                    jProgressBar32.repaint();

                    b = 0;

                }
                if (c == des.id & des.id == p.idDES) {
                    ProcesoES3.setText("proceso..." + p.id);
                    p.tiempoInterrupcion = p.tiempoInterrupcion - 1;
                    jProgressBar33.setValue(p.tiempoInterrupcion);
                    jProgressBar33.repaint();
                    c = 0;
                }
                if (d == des.id & des.id == p.idDES) {
                    ProcesoES4.setText("proceso..." + p.id);
                    p.tiempoInterrupcion = p.tiempoInterrupcion - 1;
                    jProgressBar34.setValue(p.tiempoInterrupcion);
                    jProgressBar34.repaint();
                    d = 0;
                }
                if (e == des.id & des.id == p.idDES) {
                    ProcesoES5.setText("proceso..." + p.id);
                    p.tiempoInterrupcion = p.tiempoInterrupcion - 1;
                    jProgressBar35.setValue(p.tiempoInterrupcion);
                    jProgressBar35.repaint();
                    e = 0;
                }

            }

            ColaES2.add(p);

        }
        return ColaES2;

    }

    public ArrayList<Proceso> eliminarProcesosListosColaES(ArrayList<Proceso> ColaES) {// borrar
        ArrayList<Proceso> ColaES2 = new ArrayList<Proceso>();

        for (Proceso S : ColaES) {
            if (S.tiempoInterrupcion > 0) {
                ColaES2.add(S);

            }
        }
        return ColaES2;

    }


    /*public ArrayList<DispositivoES> AdministrarDES(ArrayList<Proceso> ColaES,ArrayList<DispositivoES> DES){
    ArrayList<DispositivoES> DES1 = new ArrayList<DispositivoES>();
    
for (DispositivoES d : DES){ 
                   for (Proceso p : ColaES) {
                    if ( d.estado=="ocupado"& d.id==p.idDES & p.tiempoInterrupcion==0 ){
                           d.estado="libre"; 
                      
                    }
                }
                   
                  DES1.add(d);
                }
        return DES1;


}
     */
}
