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

    }

    public Empleado auth(String usuario, String password) {

        try {
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

    public boolean insert(Empleado empleado) {
        boolean creado = false;
        try {
            String consulta = "insert into empleado (Cedula_Empleado,Nombres,Fecha_Ingreso,Duracion_Contrato,EPS,ARL,RH,Caja_Compensacion,Fondo_Pension,ID_Departamento) values"
                    + "(?,?,(SELECT CURDATE()),?,?,?,?,?,?,?)";
            String consulta2 = "insert into usuario_empleado(Cedula_Empleado,Usuario,Password,Tipo) values (?,?,?,?)";
            String querys = "Insert into cargo_empleado (ID_Cargo,Cedula_Empleado) values (?,?)";
            PreparedStatement pst = con.prepareStatement(consulta);
            PreparedStatement pstv = con.prepareStatement(consulta2);
            PreparedStatement pque= con.prepareStatement(querys);
            pst.setString(1, empleado.getCedula() + "");
            pst.setString(2, empleado.getNombres());
            pst.setString(3, empleado.getDuracion() + "");
            pst.setString(4, empleado.getEps());
            pst.setString(5, empleado.getArl());
            pst.setString(6, empleado.getRh());
            pst.setString(7, empleado.getCj());
            pst.setString(8, empleado.getFp());
            pst.setString(9, empleado.getIdepartamento()+"");
            pstv.setString(1, empleado.getCedula() + "");
            pstv.setString(2, empleado.getUsuario());
            pstv.setString(3, empleado.getPassword());
            pstv.setString(4, empleado.getTipo());
            pque.setString(1, empleado.getIdcargo()+"");
            pque.setString(2, empleado.getCedula()+"");
            pst.executeUpdate();
            pstv.executeUpdate();
            pque.executeUpdate();
            creado = true;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return creado;

    }

}
