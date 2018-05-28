package SQL;

import Modelo.Empleado;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductoC {

    private Connection con;

    public ProductoC(Connection con) {
        this.con = con;
    }

    public ArrayList<Producto> getListaP() {
        ArrayList<Producto> lista = new ArrayList<>();
        try {
            String consulta = "SELECT * FROM producto";

            PreparedStatement pst = con.prepareStatement(consulta);
            ResultSet rs = pst.executeQuery();
            Producto prod = null;

            while (rs.next()) {
                prod = new Producto();
                prod.setIdproducto(rs.getInt("ID_Producto"));
                prod.setNombreproducto(rs.getString("Nombre"));
                prod.setIdproveedor(rs.getInt("ID_Proveedor"));
                prod.setInventario(rs.getInt("Inventario"));
                prod.setPrecio(rs.getDouble("Precio"));
                lista.add(prod);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return lista;
    }

    public boolean insert(Producto producto) {
        boolean creado = false;
        try {
            String consulta = "insert into producto (ID_Producto,Nombre,ID_Proveedor,Inventario,Precio) values (?,?,?,?,?)";
            String consulta2 = "insert into proveedor_producto(ID_Producto,ID_Proveedor) values (?,?)";
            PreparedStatement pst = con.prepareStatement(consulta);
            PreparedStatement pstv = con.prepareStatement(consulta2);
            pst.setString(1, producto.getIdproducto() + "");
            pst.setString(2, producto.getNombreproducto());
            pst.setString(3, producto.getIdproveedor() + "");
            pst.setString(4, producto.getInventario() + "");
            pst.setString(5, producto.getPrecio() + "");
            pstv.setString(1, producto.getIdproducto()+"");
            pstv.setString(2, producto.getIdproveedor()+"");
            pst.executeUpdate();
            pstv.executeUpdate();
            creado = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return creado;
    }
     public boolean delete(int id) {
        boolean creado = false;
        try {
            String consulta = "delete from producto where ID_Producto=?;";
            String consulta2 = "delete from proveedor_producto where ID_Producto=?;";
            PreparedStatement pst = con.prepareStatement(consulta);
            PreparedStatement pstv = con.prepareStatement(consulta2);
            pst.setString(1, id+"");
            pstv.setString(1, id+"");
            pst.executeUpdate();
            pstv.executeUpdate();
            creado = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return creado;
    }
}
