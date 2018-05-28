package SQL;

import Modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author juanc
 */
public class EmpleadoC {

    private Connection con;

    public EmpleadoC(Connection con) {
        this.con = con;
        System.out.println("todo bien gonorrea 33");


    }

    public Empleado auth(String usuario, String password) {

        try {
            System.out.println("todo bien gonorrea 23");
            String consulta = "SELECT * FROM usuario_empleado u INNER JOIN empleado e ON e.Cedula_Empleado=u.Cedula_Empleado WHERE u.Usuario = ? AND u.Password = ? ";
       
            PreparedStatement pst = con.prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            Empleado emp = new Empleado();
            
            if (rs.absolute(1)) {
                
                emp.setCedula(rs.getInt("u.Cedula_Empleado"));
                emp.setUsuario(rs.getString("u.Usuario"));
                emp.setPassword(rs.getString("u.Password"));
                emp.setTipo(rs.getString("u.Tipo"));
                emp.setNombres(rs.getString("e.Nombres"));
                emp.setEps(rs.getString("e.EPS"));
                emp.setArl(rs.getString("e.ARL"));
                emp.setRh(rs.getString("e.RH"));
                emp.setFp(rs.getString("e.Fondo_Pension"));
                emp.setCj(rs.getString("e.Caja_Compensacion"));
                emp.setIdepartamento(rs.getInt("e.ID_Departamento"));
                System.out.println("todo bien gonorrea2.0");
                return emp;
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

}
