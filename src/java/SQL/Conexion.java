package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Conexion {

    public Connection conectar() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/thejourney3";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "Yosoyjcpa16.");
            System.out.println("Conexión establecida como root");

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error");
            System.err.println(e.getMessage());
        }
        return con;
    }

}
