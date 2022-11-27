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
        String sql = "update Permisos set estado= ?, fecha_autorizacion=current_timestamp where user_id= ? and rol_neg_id= ? and app_id= ?";

        Conexion xConexion = Conexion.GetInstance();
        PreparedStatement stmt = xConexion.conn.prepareStatement(sql);

        try {
            stmt.setString(1,"Rechazado");
            stmt.setInt(2, userId);
            stmt.setInt(3, rolNegId);
            stmt.setInt(4, appId);
            int cont = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Error("Problem", e);
        } catch (Exception e){
            e.printStackTrace();
            throw new Error("Problem", e);
        }
    }

    public static void updatePermisoAceptado(int userId, int rolNegId, int appId) throws SQLException {
        String sql = "update Permisos set estado= ?, fecha_autorizacion=current_timestamp where user_id= ? and rol_neg_id= ? and app_id= ?";

        Conexion xConexion = Conexion.GetInstance();
        PreparedStatement stmt = xConexion.conn.prepareStatement(sql);
       
        try {
            stmt.setString(1,"Aprobado");
            stmt.setInt(2, userId);
            stmt.setInt(3, rolNegId);
            stmt.setInt(4, appId);
            int cont = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Error("Problem", e);
        } catch (Exception e){
            e.printStackTrace();
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
                int appId = Integer.parseInt(rs.getString(2));
                int rolNegId = Integer.parseInt(rs.getString(3));
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
}
