/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Data.Modelos.PersonaModel;
import Recursos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author nmais
 */
public class PersonaDAO {

    public static PersonaModel getPersonaByUserId(int pUserId) throws SQLException {
        PersonaModel xPersona = null;
        String sql = "select * from Personas where user_id = ?";
        Conexion xConexion = Conexion.GetInstance();
        PreparedStatement stmt = xConexion.conn.prepareStatement(sql);
        try {
            stmt.setInt(1, pUserId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                xPersona = new PersonaModel(Integer.parseInt(rs.getString(1)), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        return xPersona;
    }

    public static void createPersona(PersonaModel pPersona) throws SQLException {
        String sql = "insert into Personas (user_id,nombre,apellido,direccion,ciudad,departamento,hashpwd)"
                + " Values (?,?,?,?,?,?,?)";
        Conexion xConexion = Conexion.GetInstance();
        PreparedStatement stmt = xConexion.conn.prepareStatement(sql);
        try {
            stmt.setInt(1, pPersona.UserId);
            stmt.setString(2, pPersona.Nombre);
            stmt.setString(3, pPersona.Apellido);
            stmt.setString(4, pPersona.Direccion);
            stmt.setString(5, pPersona.Ciudad);
            stmt.setString(6, pPersona.Departamento);
            stmt.setString(7, pPersona.Hashpwd);
            int cont = stmt.executeUpdate();
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }

    public static void updatePassword(PersonaModel pPersona) throws SQLException {
        String sql = "update Personas set hashpwd = ? where user_id = ?";
        Conexion xConexion = Conexion.GetInstance();
        PreparedStatement stmt = xConexion.conn.prepareStatement(sql);
        try {
            stmt.setString(1, pPersona.Hashpwd);
            stmt.setInt(2, pPersona.UserId);
            int cont = stmt.executeUpdate();
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }
}
