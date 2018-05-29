/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import Modelo.Cargo;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mate_
 */
public class CargoC {

    private Connection con;

    public CargoC(Connection con) {
        this.con = con;
    }

    public boolean insert(Cargo cargo) {
        boolean creado = false;
        try {
            String consulta = "insert into cargo (ID_Cargo,ObjetivoVentas,Comisiones,Memorandos,Nombre_Cargo) values (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(consulta);
            pst.setString(1, cargo.getIdcargo()+ "");
            pst.setString(2, cargo.getObjetivoventas()+"");
            pst.setString(3, cargo.getComisiones() + "");
            pst.setString(4, cargo.getMemorandos() + "");
            pst.setString(5, cargo.getNombrecargo());
            pst.executeUpdate();
            creado = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return creado;
    }
}
