/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Pedro
 */
public class PCB {

        public int id;
        public int burstTime;
        public int interrupciones;
        public int prioridad;
        public int peso;
        public int periodoInterrupcion;
        public String estado;
        public int tiempoArribo;
        public int tiempoInterrupcion;
        public String codError;
        public int idDES; //no sé qué es
        public int PC;

    public PCB(/*int id, int burstime, int interrupcion, int prioridad, int peso, int periodoInterrupcion, String estado, int tiempoArribo, int tiempoInterrupcion, String codError, int idDES, int PC*/) {
        this.id = 0;
        this.burstTime = 0;
        this.interrupciones = 0;
        this.prioridad = 0;
        this.peso = 0;
        this.periodoInterrupcion = 0;
        this.estado = "";
        this.tiempoArribo = 0;
        this.tiempoInterrupcion = 0;
        this.codError = "";
        this.idDES = 0;
        this.PC = 0;
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
