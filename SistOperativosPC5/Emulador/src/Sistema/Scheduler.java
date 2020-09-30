package Sistema;

import Clases.Proceso;
import java.util.ArrayList;

public class Scheduler {
    public Proceso pNext(ArrayList<Proceso> Colal, int politica){
        
        Politicas p=new Politicas();
        Politicas pNext=new Politicas();
        /*switch (politica){
            case 1:
                return p.FCFS(Colal);
                
            case 2:
                return p.RR(Colal);
            case 3:
                return p.Prioridades(Colal);
            case 4:
                return p.SJF(Colal);              
        }
        */
        if (politica==1){
            return p.FCFS(Colal);
            
        }else if(politica==2){
            return p.RR(Colal);
            
        }else if(politica==3){
            return p.Prioridades(Colal);
            
        }else{
            return p.SJF(Colal);
        }
    }
}
