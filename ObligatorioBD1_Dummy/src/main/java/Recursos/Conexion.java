/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author prueba
 */
public class Conexion {
    private static Conexion instance;
    private static final String url = "jdbc:sqlserver://srv-obligatorio.database.windows.net:1433;database=ObligatorioBD1;user=FPMUser@srv-obligatorio;password=FPMUsuarioBD1;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
    public static Connection conn;

    private Conexion() {
    }

    public static Conexion GetInstance() {
        if (instance == null) {
            instance = new Conexion();
            try {
                conn = createConnection();
            } catch (SQLException e ) {
                throw new Error("Problem", e);
          } 
        }
        return instance;
    }

    private static Connection createConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(url);
        return conn;
    }

    
}
