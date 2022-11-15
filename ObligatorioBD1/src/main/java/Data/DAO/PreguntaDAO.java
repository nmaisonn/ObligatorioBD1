/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Data.Modelos.PersonaModel;
import Data.Modelos.PreguntaModel;
import Recursos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author nmais
 */
public class PreguntaDAO {

    public static PreguntaModel getPreguntaByPregunta(String pPregunta) throws SQLException {
        PreguntaModel xPregunta = null;
        String sql = "select * from Preguntas where pregunta = ?" ;
        Conexion xConexion = Conexion.GetInstance();
        PreparedStatement stmt = xConexion.conn.prepareStatement(sql);
        try {
            stmt.setString(1, pPregunta);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                xPregunta = new PreguntaModel(Integer.parseInt(rs.getString(1)), rs.getString(2));
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        return xPregunta;
    }

    public static PreguntaModel[] getPreguntas() throws SQLException {
        LinkedList<PreguntaModel> xPreguntas = new LinkedList();
        String sql = "select * from Preguntas";
        Conexion xConexion = Conexion.GetInstance();
        Statement stmt = xConexion.conn.createStatement();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = Integer.parseInt(rs.getString(1));
                String preg = rs.getString(2);
                xPreguntas.add(new PreguntaModel(id, preg));
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        PreguntaModel[] xRetorno = new PreguntaModel[xPreguntas.size()];
        int i = 0;
        for (PreguntaModel x : xPreguntas) {
            xRetorno[i] = x;
            i++;
        }
        return xRetorno;
    }
}
