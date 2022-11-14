/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Negocio.DTOS.PersonaDTO;
import Negocio.DTOS.PersonaPreguntaDTO;
import Recursos.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
