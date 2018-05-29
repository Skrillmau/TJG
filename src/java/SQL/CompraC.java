/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import Modelo.FacturaDetalle;
import Modelo.RegistroCompras;
import Modelo.Tipos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author juanc
 */
public class CompraC {

    private Connection con;

    public CompraC(Connection con) {
        this.con = con;

    }
    
    public boolean realizarVenta(RegistroCompras registro,FacturaDetalle factura){
        boolean venta=false;
        try {
            String consulta = "INSERT INTO registro_compras (fecha_compra,ID_mEntrega,ID_metodopago,Preciofactura) values  ((SELECT CURDATE()),?,?,?)";
            String consulta2= "INSERT INTO facturadetalle (ID_factura,ID_Producto,Cantidad) values ((select ID_Registro from registro_compras ORDER BY ID_Registro  DESC LIMIT 1),?,?)";
            String querys1="select @inv:=inventario from producto where ID_Producto=? LIMIT 1;";
            String querys = "UPDATE producto SET Inventario= (@inv-?) where ID_Producto = ?;";
            
            PreparedStatement pst = con.prepareStatement(consulta);
            PreparedStatement pstv = con.prepareStatement(consulta2);
            PreparedStatement qpst = con.prepareStatement(querys1);
            PreparedStatement querysp = con.prepareStatement(querys);
            pst.setString(1, registro.getIdmentrega()+"");
            pst.setString(2, registro.getIdformapago()+"");
            pst.setString(3, registro.getPrecio()+"");
            pstv.setString(1, factura.getIdproducto()+"");
            pstv.setString(2, factura.getCantidad()+"");
            qpst.setString(1, factura.getIdproducto()+"");
            querysp.setString(1,factura.getCantidad()+"");
            querysp.setString(2, factura.getIdproducto()+"");
            pst.executeUpdate();
            pstv.executeUpdate();
            qpst.executeQuery();
            querysp.executeUpdate();
            venta=true;
        } catch (SQLException e) {
            System.out.println(e);
        }   
        
        return venta;
    }

}
