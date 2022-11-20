/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Data.Modelos.AplicativoModel;
import Recursos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author nmais
 */
public class AplicativoDAO {

    public static AplicativoModel[] getAplicativos() throws SQLException {
        AplicativoModel[] xAplicativos = null;
        String sql = "select * from Aplicativos";
        Conexion xConexion = Conexion.GetInstance();
        PreparedStatement stmt = xConexion.conn.prepareStatement(sql);
        try {
            ResultSet rs = stmt.executeQuery();
            int i = 0;
            while (rs.next()) {
                xAplicativos[i] = new AplicativoModel(Integer.parseInt(rs.getString(1)), rs.getString(2));
                i++;
            }

        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        return xAplicativos;
    }
}
