
package Clases;

import Aleatorio.Random;
import java.sql.SQLException;


public class Proceso {
    
        public int id;
        public int burstTime;
        public int interrupciones;
        public int prioridad;
        public int peso;
        public int periodoInterrupcion;
        public String estado;
        public int tiempoArribo;
        public int tiempoInterrupcion;
        public int tiempoEspera;
        public int tiempoRetorno;
        public String codError;
        public int idDES;
        public int PC;
        
    
    public Proceso(int id) throws SQLException {
        Random r=new Random();
        this.tiempoArribo=r.exponencial(100);
        this.burstTime =r.uniforme(21,100);
        this.interrupciones = r.uniforme(5,20);
        this.tiempoInterrupcion=0;//
        this.prioridad = r.exponencial(20);
        this.id = id;//
        this.peso = r.exponencial(50);
        this.periodoInterrupcion = this.burstTime/this.interrupciones;
        this.estado = "iniciado";
        this.tiempoEspera=0;
        this.tiempoRetorno=0;
        this.codError="";
        this.idDES=0;
        this.PC=this.id*1000;
        
    }
    
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstime) {
        this.burstTime = burstime;
    }

    public int getInterrupciones() {
        return interrupciones;
    }

    public void setInterrupciones(int interrupcion) {
        this.interrupciones = interrupcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPeriodoInterrupcion() {
        return periodoInterrupcion;
    }

    public void setPeriodoInterrupcion(int periodoInterrupcion) {
        this.periodoInterrupcion = periodoInterrupcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTiempoArribo() {
        return tiempoArribo;
    }

    public void setTiempoArribo(int tiempoArribo) {
        this.tiempoArribo = tiempoArribo;
    }

    public int getTiempoInterrupcion() {
        return tiempoInterrupcion;
    }

    public void setTiempoInterrupcion(int tiempoInterrupcion) {
        this.tiempoInterrupcion = tiempoInterrupcion;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public int getTiempoRetorno() {
        return tiempoRetorno;
    }

    public void setTiempoRetorno(int tiempoRetorno) {
        this.tiempoRetorno = tiempoRetorno;
    }

    public String getCodError() {
        return codError;
    }

    public void setCodError(String codError) {
        this.codError = codError;
    }

    public int getIdDES() {
        return idDES;
    }

    public void setIdDES(int idDES) {
        this.idDES = idDES;
    }

    public int getPC() {
        return PC;
    }

    public void setPC(int PC) {
        this.PC = PC;
    }
        
    
}
