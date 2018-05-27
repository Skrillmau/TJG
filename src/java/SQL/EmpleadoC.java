
package SQL;

import Modelo.Empleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author juanc
 */
public class EmpleadoC extends Conexion {
    
    
    public boolean auth(String usuario, String password){
        PreparedStatement pst = null;
        ResultSet rs = null;
        try{
           
            String consulta = "SELECT * FROM usuarios_empleado u INNER JOIN empleado e ON e.Cedula_Empleado=u.Cedula_Empleado WHERE u.Usuario = ? AND u.Password = ? ";
            System.out.print(consulta);
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1,usuario);
            pst.setString(2, password);
            rs = pst.executeQuery();
            
            Empleado emp = new Empleado();
            
            if(rs.absolute(1)){
                emp.setCedula(rs.getInt("u.Cedula_Empleado"));
                emp.setUsuario(rs.getString("u.Usuario"));
                emp.setPassword(rs.getString("u.Password"));
                emp.setTipo(rs.getString("u.Tipo"));
                emp.setNombres(rs.getString("e.Nombres"));
                emp.setEps(rs.getString("e.EPS"));
                emp.setArl(rs.getString("e.ARL"));
                emp.setRh(rs.getString("e.RH"));
            }
            
        }catch (Exception e){
            
        }
        
        
        
        
        
        return false;
    }
    
}
