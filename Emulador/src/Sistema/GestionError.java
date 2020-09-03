
package Sistema;

import Aleatorio.Random;
import Clases.PCB;
import java.sql.SQLException;

public class GestionError {
   public boolean bucleinf() throws SQLException{
        double x=0;
        boolean T=false;
        Random rn= new Random();
        
        if(rn.Bernulli()){
            T=true;
        }
    return T;
    
    }
    public PCB codigoError (PCB pcb){        
        pcb.setCodError("bucle_inf");    
   return pcb; 
    }

 
}
