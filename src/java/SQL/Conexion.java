package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nikolas
 */
public class Conexion {

    public Connection conectar() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/thejourneygroup?serverTimezone=UTC";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "julian1219");
            System.out.println("Conexión establecida como root");

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error");
            System.err.println(e.getMessage());
        }
        return con;
    }

    public ResultSet ObtenerTodo(String NombreCol1) {
        Connection con = conectar();
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("select " + NombreCol1 + " from empleado" + ";");

            rs = ps.executeQuery();

        } catch (Exception e) {
            System.err.println("Error en método Obtener" + e);

        }
        return rs;

    }

    public ResultSet ObtenerTodoUltimo(String NombreCol1, String NombreTabla) {
        Connection con = conectar();
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("select " + NombreCol1 + " from " + " " + NombreTabla + " ORDER BY " + NombreCol1 + " DESC LIMIT 1;");

            rs = ps.executeQuery();

        } catch (Exception e) {
            System.err.println("Error en método Obtener" + e);

        }
        return rs;

    }

    public void disconnect(Connection con) {
        System.out.println("Closing database: [" + con + "] OK");
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
}
