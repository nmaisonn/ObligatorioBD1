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
 * @author nmais
 */
public class Hashing {

    private static Hashing instance;
    public static String passwd;

    private Hashing() {
    }

    public static Hashing GetInstance() {
        if (instance == null) {
            instance = new Hashing();
            
        }
        return instance;
    }
/*
    private static Connection createConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(url);
        return conn;
    }
*/

}
