/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import Modelo.Producto;
import Modelo.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mate_
 */
public class ProveedorC {

    private Connection con;

    public ProveedorC(Connection con) {
        this.con = con;
    }

    public boolean insert(Proveedor proveedor) {
        boolean creado = false;
        try {
            String consulta = "insert into proveedor"
                    + "(ID_Proveedor,Razon_Social,Direccion,Correo,Telefono,Certificacion_Bancaria,RUT)"
                    + " values (?,?,?,?,?,?,?);";
            PreparedStatement pst = con.prepareStatement(consulta);
            pst.setString(1, proveedor.getIdproveedor() + "");
            pst.setString(2, proveedor.getRazonsocial());
            pst.setString(3, proveedor.getDireccion());
            pst.setString(4, proveedor.getCorreo());
            pst.setString(5, proveedor.getTelefono()+"");
            pst.setString(6, proveedor.getCerban()+"");
            pst.setString(7, proveedor.getRut()+"");
            pst.executeUpdate();
            creado = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return creado;
    }

}
