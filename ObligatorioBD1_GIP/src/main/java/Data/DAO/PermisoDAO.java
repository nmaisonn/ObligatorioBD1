/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Data.Modelos.PermisoModelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Recursos.Conexion;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author prueba
 */
public class PermisoDAO {

    public static void updatePermisoRechazado(int userId, int rolNegId, int appId) throws SQLException {
        String fecha = java.time.LocalDateTime.now().toString().split("T")[0];
        String estado = "Rechazado";
        String sql = "update Permisos set Estado="+estado+", Fecha_Autorizacion="+fecha+" where user_id="+userId+" and app_id="+appId+" and rol_neg_id="+rolNegId;

        Conexion xConexion = Conexion.GetInstance();
        Statement stmt = xConexion.conn.createStatement();
        
        /*stmt.setString(1, fecha);
        stmt.setInt(2, userId);
        stmt.setInt(3, appId);
        stmt.setInt(4, rolNegId);*/

        try {
            stmt.executeUpdate(sql);
            //ResultSet rs = stmt.executeQuery(QUERY);

        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }

    public static void updatePermisoAceptado(int userId, int rolNegId, int appId) throws SQLException {
        String fecha = java.time.LocalDateTime.now().toString().split("T")[0];
        String sql = "update Permisos set Estado=Aprobado, Fecha_Autorizacion=? where user_id=? and app_id=? and rol_neg_id=?";

        Conexion xConexion = Conexion.GetInstance();
        PreparedStatement stmt = xConexion.conn.prepareStatement(sql);
        stmt.setString(1, fecha);
        stmt.setInt(2, userId);
        stmt.setInt(3, appId);
        stmt.setInt(4, rolNegId);

        try {
            int cont = stmt.executeUpdate();
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }

    public static PermisoModelo[] getPermisos() throws SQLException {
        LinkedList<PermisoModelo> xPermisos = new LinkedList();
        String sql = "select * from Permisos";
        Conexion xConexion = Conexion.GetInstance();
        Statement stmt = xConexion.conn.createStatement();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int userId = Integer.parseInt(rs.getString(1));
                int rolNegId = Integer.parseInt(rs.getString(2));
                int appId = Integer.parseInt(rs.getString(3));
                String fechaSoli = rs.getDate(4).toString();
                String fechaAuto = null;
                if (rs.getDate(5) != null) {
                    fechaAuto = rs.getDate(5).toString();
                }
                String estado = rs.getString(6);  //cuantas columnas tiene permisos
                xPermisos.add(new PermisoModelo(userId, rolNegId, appId, fechaSoli, fechaAuto, estado));
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        PermisoModelo[] xRetorno = new PermisoModelo[xPermisos.size()];
        int i = 0;
        for (PermisoModelo x : xPermisos) {
            xRetorno[i] = x;
            i++;
        }
        return xRetorno;
    }
;

}
