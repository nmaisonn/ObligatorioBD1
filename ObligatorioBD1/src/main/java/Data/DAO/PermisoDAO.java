/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Data.Modelos.PermisoModel;
import Recursos.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author nmais
 */
public class PermisoDAO {

    public static void crearSolicitud(PermisoModel pPermiso) throws SQLException {
        String sql = "insert into Permisos (user_id,app_id,rol_neg_id,fecha_solicitud,fecha_autorizacion,estado)"
                + " Values (?,?,?,?,?,?)";
        Conexion xConexion = Conexion.GetInstance();
        PreparedStatement stmt = xConexion.conn.prepareStatement(sql);
        try {
            stmt.setInt(1, pPermiso.UserId);
            stmt.setInt(2, pPermiso.AppId);
            stmt.setInt(3, pPermiso.RolNegId);
            stmt.setString(4, pPermiso.FechaSolicitud.split("T")[0]);
            if (pPermiso.FechaAutorizacion != null) {
                stmt.setString(5, pPermiso.FechaAutorizacion.split("T")[0]);
            } else {
                stmt.setString(5,null);
            }
            stmt.setString(6, pPermiso.Estado);
            int cont = stmt.executeUpdate();
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }
}
