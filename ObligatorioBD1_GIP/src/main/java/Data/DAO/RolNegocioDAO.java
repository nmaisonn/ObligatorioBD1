/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Data.Modelos.RolNegocioModel;
import Recursos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author nmais
 */
public class RolNegocioDAO {
     public static RolNegocioModel getRolNegocioById(int pRolNegId) throws SQLException {
        RolNegocioModel xRolNegocioModel = null;
        String sql = "select * from Roles_Negocio where rol_neg_id= ?";
        Conexion xConexion = Conexion.GetInstance();
        PreparedStatement stmt = xConexion.conn.prepareStatement(sql);
        try {
            stmt.setInt(1, pRolNegId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                xRolNegocioModel = new RolNegocioModel(Integer.parseInt(rs.getString(1)), rs.getString(2));
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        return xRolNegocioModel;
    }

}
