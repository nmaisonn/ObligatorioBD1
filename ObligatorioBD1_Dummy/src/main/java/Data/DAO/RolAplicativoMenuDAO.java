/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Data.Modelos.RolAplicativoMenuModelo;
import Recursos.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author prueba
 */
public class RolAplicativoMenuDAO {
    public static RolAplicativoMenuModelo getRolAplicativoMenu(int pappId, int prolId) throws SQLException {
       RolAplicativoMenuModelo xRolAppMenu = null;
        String x = Integer.toString(pappId);
        String p = Integer.toString(prolId);
        String sql = "select * from Roles_Aplicativos_Menu where app_id=" + x + " AND rol_id=" + p;
 
        Conexion xConexion = Conexion.GetInstance();
        Statement stmt = xConexion.conn.createStatement();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int appId = Integer.parseInt(rs.getString(1));
                int rolId = Integer.parseInt(rs.getString(2));
                int menuId = Integer.parseInt(rs.getString(3));
            
                xRolAppMenu = new RolAplicativoMenuModelo(appId,rolId, menuId);
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        
        return xRolAppMenu;  
    }
}
