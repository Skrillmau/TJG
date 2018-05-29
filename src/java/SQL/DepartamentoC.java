/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import Modelo.Departamento;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mate_
 */
public class DepartamentoC {

    private Connection con;

    public DepartamentoC(Connection con) {
        this.con = con;
    }

    public boolean insert(Departamento dep) {
        boolean creado = false;
        try {
            String consulta = "insert into departamento (Nombre,Descripcion) values (?,?)";
            PreparedStatement pst = con.prepareStatement(consulta);
            pst.setString(1, dep.getNombre());
            pst.setString(2, dep.getDescribe());
            pst.executeUpdate();
            creado = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return creado;
    }
}
