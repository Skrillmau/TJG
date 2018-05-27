
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author juanc
 */
public class Conexion {
    Connection conectar = null;
    
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/thejourneygroup?autoReconnect=true&useSSL=false","root","Yosoyjcpa16.");
            System.out.print("aklsjdakdla");
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
    public Connection getConexion(){
        return conectar;
    }
    
    
    
}
