/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Data.Modelos.PersonaModel;
import Data.Modelos.PersonaPreguntaModel;
import Negocio.DTOS.PersonaDTO;
import Negocio.DTOS.PersonaPreguntaDTO;
import Recursos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nmais
 */
public class PersonaPreguntaDAO {

    public static void crearPersonaPregunta(PersonaPreguntaDTO pPersonaPregunta) throws SQLException {
        String sql = "insert into Personas_Preguntas (user_id,preg_id,respuesta)"
                + " Values (?,?,?)";
        Conexion xConexion = Conexion.GetInstance();
        PreparedStatement stmt = xConexion.conn.prepareStatement(sql);
        try {
            /*stmt.setInt(1, pPersonaPregunta.UserId);
            stmt.setString(2, pPersonaPregunta.PregId);
            stmt.setString(3, pPersonaPregunta.Respuesta);
             */
            int cont = stmt.executeUpdate();
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }

    public static PersonaPreguntaModel getPersPregByUserId(int userId) throws SQLException {
        PersonaPreguntaModel persPreg = null;
        String sql = "select * from Personas_Preguntas where user_id = " + userId;
        Conexion connection = Conexion.GetInstance();
        Statement stmt = connection.conn.createStatement();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                persPreg = new PersonaPreguntaModel(Integer.parseInt(rs.getString(1)), Integer.parseInt(rs.getString(2)), rs.getString(3));
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        return persPreg;
    }
}
