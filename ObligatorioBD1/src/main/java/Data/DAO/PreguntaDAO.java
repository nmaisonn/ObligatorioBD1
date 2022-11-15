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

    public static PreguntaModel getPreguntaById(int pregId) throws SQLException {
        PreguntaModel preg = null;
        String sql = "select * from Preguntas where preg_id =" + pregId;
        Conexion xConexion = Conexion.GetInstance();
        Statement stmt = xConexion.conn.createStatement();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                preg = new PreguntaModel(Integer.parseInt(rs.getString(1)), rs.getString(2));
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        return preg;
    }
}
