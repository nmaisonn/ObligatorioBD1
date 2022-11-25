/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Data.Modelos.AplicativoMenuModelo;
import Recursos.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author prueba
 */
public class AplicativoMenuDAO {
    
    public static AplicativoMenuModelo getAplicativoMenu(int pappId, int pmenuId) throws SQLException {
       AplicativoMenuModelo xAppMenu = null;
        String x = Integer.toString(pappId);
        String p = Integer.toString(pmenuId);
        String sql = "select * from Aplicativos_Menu where app_id=" + x + "AND menu_id=" + p;
 
        Conexion xConexion = Conexion.GetInstance();
        Statement stmt = xConexion.conn.createStatement();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int appId = Integer.parseInt(rs.getString(1));
                int menuId = Integer.parseInt(rs.getString(2));
                String descripcionMenu = rs.getString(3);
            
                xAppMenu = new AplicativoMenuModelo(appId,menuId, descripcionMenu);
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        
        return xAppMenu;  
    }
}
