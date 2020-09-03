package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:8002/bdl?", "root", "");
        } catch(ClassNotFoundException|SQLException ex){
            return null;
        }
        
    }
}
