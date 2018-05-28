package SQL;

import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author juanc
 */
public class ClienteC {

    private Connection con;

    public ClienteC(Connection con) {
        this.con = con;

    }

    public Cliente auth(String usuario, String password) {

        try {
            String consulta = "SELECT * FROM usuario_cliente u INNER JOIN cliente c ON c.Cedula = u.Cedula_Cliente WHERE u.Usuario = ? AND u.Password = ? ";

            PreparedStatement pst = con.prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            Cliente cliente = new Cliente();

            if (rs.absolute(1)) {

                cliente.setCedula(rs.getInt("u.Cedula_Cliente"));
                cliente.setUsuario(rs.getString("u.Usuario"));
                cliente.setPassword(rs.getString("u.Password"));
                cliente.setNombres(rs.getString("c.Nombres"));
                cliente.setCorreo(rs.getString("c.Correo"));
                cliente.setTelefono(rs.getInt("c.Telefono"));
                cliente.setDireccion(rs.getString("c.Direccion"));
                cliente.setCiudad(rs.getString("c.Ciudad"));
                cliente.setMedio_contacto(rs.getString("c.Medio_Contacto"));
                return cliente;
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

    public boolean insert(Cliente cliente) {
        boolean creado = false;
        try {
            String consulta = "insert into cliente (Cedula,Nombres,Correo,Telefono,Direccion,Ciudad,Medio_Contacto) values "
                    + "(?,?,?,?,?,?,?)";
            String consulta2="insert into usuario_cliente (Cedula_Cliente,Usuario,Password) values "
                    + "(?,?,?)";
            PreparedStatement pst = con.prepareStatement(consulta);
            PreparedStatement pstv = con.prepareStatement(consulta2);
            pst.setString(1, cliente.getCedula()+"");
            pst.setString(2, cliente.getNombres());
            pst.setString(3, cliente.getCorreo());
            pst.setString(4, cliente.getTelefono() + "");
            pst.setString(5, cliente.getDireccion());
            pst.setString(6, cliente.getCiudad());
            pst.setString(7, cliente.getMedio_contacto());
            pstv.setString(1, cliente.getCedula()+"");
            pstv.setString(2, cliente.getUsuario());
            pstv.setString(3, cliente.getPassword());
            pst.executeUpdate();
            pstv.executeUpdate();
            creado = true;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return creado;
    }

}
