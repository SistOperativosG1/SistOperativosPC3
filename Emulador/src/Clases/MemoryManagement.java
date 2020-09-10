
package Clases;


public class MemoryManagement {
    String Metodo_De_Asignacion;

    public MemoryManagement(String Metodo_De_Asignacion) {
        this.Metodo_De_Asignacion = Metodo_De_Asignacion;
    }

    public String getMetodo_De_Asignacion() {
        return Metodo_De_Asignacion;
    }

    public void setMetodo_De_Asignacion(String Metodo_De_Asignacion) {
        this.Metodo_De_Asignacion = Metodo_De_Asignacion;
    }

    public void asignarMemoriaProceso(Bits mapa, Memory memoria, Proceso proceso){
        Integer inicio = 0;
        Integer fin = 0;
        Integer tamaño = -1;
        Boolean control = true;
        switch(this.Metodo_De_Asignacion){
            case("First Fit"):
                for(int i = 0; i < memoria.getTamaño()/16; i++){
                    if(proceso.getTamaño()<=(fin-inicio) || proceso.getTamaño() <= tamaño){
                        System.out.println(tamaño);
                        System.out.println("Saliendo del for grande");
                        break;
                    }
                    for(int j = 0; j < 16; j++){
                        if(mapa.getMapa_de_bits()[i][j]==0 && control){
                            inicio = 16*i + j;
                            tamaño++;
                            control = false;
                        }
                        if(!control){
                            tamaño++;
                        }
                        if(mapa.getMapa_de_bits()[i][j]==1 && !control){
                            fin = 16*i + j;
                            tamaño = -1;
                            control = true;
                        }
                        if(proceso.getTamaño()<=(fin-inicio) || proceso.getTamaño() <= tamaño){
                            System.out.println("Tamaño superior a tamaño");
                            fin = 16*i + j + 1;
                            break;
                        }
                    }
                }
                break;
                
            case("Best Fit"):
                break;
                
            case("Worst Fit"):
                break;
        }
        
        System.out.println(fin);
        System.out.println(inicio);
        if((fin-inicio)>=proceso.getTamaño()){
            proceso.setDirInicial(inicio);
            //Asignar en mapa de bits
            for(int i = inicio; i < fin; i++){
               Integer i1 = i/16;
               Integer j1 = i % 16;
               mapa.getMapa_de_bits()[i1][j1] = 1;
            }
            //Asignar en memoria
            for(int i = inicio; i < fin; i++){
               MemoryAddress direccion = new MemoryAddress(i, proceso);
               memoria.getMemoria()[i] = direccion;
            }
        }else{
            System.out.println("Proceso en espera a que haya espacio en memoria");
        }
    }
    
    public void desasignarMemoriaProceso(Bits mapa, Memory memoria, Proceso proceso){
        if (proceso.getEstado()=="Terminado"){
            Integer i1 = 0;
            Integer j1 = 0;
            for(int i = proceso.getDirInicial(); i < proceso.getDirInicial() + proceso.getTamaño(); i++){
                if(memoria.getMemoria()[i].getProceso().getId() == proceso.getId()){
                    i1 = i/16;
                    j1 = i % 16;
                    mapa.getMapa_de_bits()[i1][j1] = 0;
                }
            }
        }
    }
    
   public void asignarMemoriaCola(Bits mapa, Memory memoria, colaProcesos cola, Integer tick){
        for(int i = 0; i < cola.getCola_de_procesos().size(); i++){
            if(cola.getCola_de_procesos().get(i).getPulso()==tick){
                System.out.println("i es igual a " + i);
                this.asignarMemoriaProceso(mapa, memoria, cola.getCola_de_procesos().get(i));
                System.out.println("Memoria asignada en pulso " + tick);
            }
        }
    }
    
}
