/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Data.Modelos.PersonaModel;
import Data.Modelos.PreguntaModel;
import Recursos.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nmais
 */
public class PreguntaDAO {

    public static PreguntaModel getPreguntaByPregunta(String pPregunta) throws SQLException {
        PreguntaModel xPregunta = null;
        String sql = "select * from Preguntas where pregunta =" + pPregunta;
        Conexion xConexion = Conexion.GetInstance();
        Statement stmt = xConexion.conn.createStatement();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                xPregunta = new PreguntaModel(Integer.parseInt(rs.getString(1)), rs.getString(2));
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        return xPregunta;
    }
}
