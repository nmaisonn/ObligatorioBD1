/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Data.Modelos.AplicativoModelo;
import Recursos.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author prueba
 */
public class AplicativoDAO {
    public static AplicativoModelo getAplicativo(int id) throws SQLException {
        AplicativoModelo xAplicativo = null;
        String x = Integer.toString(id);
        String sql = "select * from Aplicativos where app_id=" + x;
 
        Conexion xConexion = Conexion.GetInstance();
        Statement stmt = xConexion.conn.createStatement();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int appId = Integer.parseInt(rs.getString(1));
                String nombreApp = rs.getString(2);
            
                xAplicativo = new AplicativoModelo(appId, nombreApp);
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        
        return xAplicativo; 
    }
}
