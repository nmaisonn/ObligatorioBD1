/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Negocio.DTOS.PersonaDTO;
import Recursos.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nmais
 */
public class PersonaDAO {

    public static boolean getPersonaByUserId(int pUserId) throws SQLException {
        boolean xExiste = false;
        String sql = "select * from Personas where user_id =" + pUserId;
        //Conexion xConexion = Conexion.GetInstance();

        //Statement stmt = xConexion.conn.createStatement();
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://srv-obligatorio.database.windows.net:1433;database=ObligatorioBD1;user=FPMUser@srv-obligatorio;password=FPMUsuarioBD1;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
        Statement stmt =conn.createStatement();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                xExiste = true;
                break;
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        return xExiste;
    }

    public static void createPersona(PersonaDTO pPersona) throws SQLException {
        String sql = "insert into Personas(user_id,nombre,apellido,direccion,ciudad,departamento,hashpwd)"
                + " Values (" + pPersona.UserId + "," + pPersona.Nombre + "," + pPersona.Apellido
                + "," + pPersona.Direccion + "," + pPersona.Ciudad + "," + pPersona.Departamento + ","
                + pPersona.Password + ")";
        Conexion xConexion = Conexion.GetInstance();

        Statement stmt = xConexion.conn.createStatement();

        try {
            ResultSet rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }
}
