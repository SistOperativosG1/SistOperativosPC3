/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aleatorio;

import DB.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Random {

    int rb;
    int a = 9991;
    int t = 19;
    int z = 19;
    int m = 10000;
    int b = 200 * t + z;
    float Xn;
    float A;
    Connection con = Conexion.conectar();

    public double rand() throws SQLException {
        String sql;
        float ran = 0;

        try {

            sql = "SELECT *  FROM random;";

            //variable tipo Connection
            PreparedStatement stt = con.prepareStatement(sql);
            ResultSet resul = stt.executeQuery();
            resul.next();
            A = resul.getFloat("semillaactual");

            Xn = ((a * A + b) % m);
            ran = Xn / (m - 1);
            sql = "update random set semillaactual=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setFloat(1, ran);// consulta preparada llamada SQL
            st.executeUpdate();

        } catch (Exception ex) {

        }

        return ran;
    }

    public int exponencial(int A) throws SQLException {
        int rn;
        int rb = 0;
        rn = (int) ((-A) * Math.log(1 - rand()));
        if (rn == 0) {
            rn = A;

        }
        return rn;
    }

    public int uniforme(int D, int E) throws SQLException {
        int rn;
        rn = (int) (D + (E - D) * rand());

        return rn;
    }

    public boolean Bernulli() throws SQLException {
        boolean exito = false;
        if (rand() >= 0.998) {
            exito = true;
        }
        return exito;
    }

    public int Discreta() throws SQLException {
        int VA = 5;
        double rn;
        rn = rand();
        if (rn <= 0.2) {
            VA = 1;
        } else if (rn <= 0.4) {
            VA = 2;
        } else if (rn <= 0.6) {
            VA = 3;
        } else if (rn <= 0.8) {
            VA = 4;
        }
        return VA;

    }

}
