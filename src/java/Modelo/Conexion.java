package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {

    static Connection con;
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "EJEMPLO2"; //Usuario de la base de datos
    String pass = "EJEMPLO2";//Contraseña de la base de datos

    public Connection conectar() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {

        }
        return con;
    }
}
