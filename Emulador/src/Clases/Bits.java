/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author marco
 */
public class Bits {
    private Integer[][] mapa_de_bits;

    public Bits(Integer[][] mapa_de_bits) {
        this.mapa_de_bits = mapa_de_bits;
    }

    public Integer[][] getMapa_de_bits() {
        return mapa_de_bits;
    }

    public void setMapa_de_bits(Integer[][] mapa_de_bits) {
        this.mapa_de_bits = mapa_de_bits;
    }

    public void llenarSO(Integer tamano_memoria){
        System.out.println("Llenando memoria con SO");
        for(int i = 0; i < tamano_memoria/32; i++){
            for(int j = 0; j < 16; j++){
                this.mapa_de_bits[i][j] = 0;
            }
        }
        for(int i = tamano_memoria/32; i < tamano_memoria/16; i++){
            for(int j = 0; j < 16; j++){
                this.mapa_de_bits[i][j] = 1;
            }
        }
    }
}
