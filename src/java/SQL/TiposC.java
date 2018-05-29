/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import Modelo.Producto;
import Modelo.Tipos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author juanc
 */
public class TiposC {

    private Connection con;

    public TiposC(Connection con) {
        this.con = con;
    }

    public ArrayList<Tipos> traerProveedores() {

        ArrayList<Tipos> lista = new ArrayList<>();
        try {
            String consulta = "SELECT ID_Proveedor,Razon_Social FROM proveedor";

            PreparedStatement pst = con.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();
            Tipos tipos = null;

            while (rs.next()) {
                tipos = new Tipos();
                tipos.setIdtipo(rs.getInt("ID_Proveedor"));
                tipos.setNombre(rs.getString("Razon_Social"));
                lista.add(tipos);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return lista;

    }
        public ArrayList<Tipos> traerCargos() {

        ArrayList<Tipos> lista = new ArrayList<>();
        try {
            String consulta = "SELECT ID_Cargo,Nombre_Cargo FROM cargo";
            PreparedStatement pst = con.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();
            Tipos tipos = null;

            while (rs.next()) {
                tipos = new Tipos();
                tipos.setIdtipo(rs.getInt("ID_Cargo"));
                tipos.setNombre(rs.getString("Nombre_Cargo"));
                lista.add(tipos);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return lista;

    }
    
    public ArrayList<Tipos> traerDepartamentos() {

        ArrayList<Tipos> lista = new ArrayList<>();
        try {
            String consulta = "SELECT ID_Departamento,Nombre FROM departamento";

            PreparedStatement pst = con.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();
            Tipos tipos = null;

            while (rs.next()) {
                tipos = new Tipos();
                tipos.setIdtipo(rs.getInt("ID_Departamento"));
                tipos.setNombre(rs.getString("Nombre"));
                lista.add(tipos);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return lista;

    }

    public ArrayList<Tipos> traerMetodoPago() {

        ArrayList<Tipos> lista = new ArrayList<>();
        try {
            String consulta = "SELECT * FROM formapago";

            PreparedStatement pst = con.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();
            Tipos tipos = null;

            while (rs.next()) {
                tipos = new Tipos();
                tipos.setIdtipo(rs.getInt("ID_Forma_Pago"));
                tipos.setNombre(rs.getString("Forma_Pago"));
                lista.add(tipos);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return lista;

    }

    public ArrayList<Tipos> traerMetodoEntrega() {

        ArrayList<Tipos> lista = new ArrayList<>();
        try {
            String consulta = "SELECT * FROM metodoentrega";

            PreparedStatement pst = con.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();
            Tipos tipos = null;

            while (rs.next()) {
                tipos = new Tipos();
                tipos.setIdtipo(rs.getInt("ID_mEntrega"));
                tipos.setNombre(rs.getString("Nombre"));
                lista.add(tipos);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return lista;

    }

}
