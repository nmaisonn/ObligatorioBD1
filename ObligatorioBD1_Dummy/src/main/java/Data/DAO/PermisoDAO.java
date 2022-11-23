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
    
     
    
    public static PermisoModelo[] getPermisos() throws SQLException{
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
                if(rs.getDate(5)!= null){
                     fechaAuto = rs.getDate(5).toString();
                } 
                String estado = rs.getString(6);  //cuantas columnas tiene permisos
                xPermisos.add(new PermisoModelo( userId, rolNegId, appId,fechaSoli,fechaAuto, estado));
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
    };
    
    public static int[] getAppIdByUserId(int userId) throws SQLException {
        LinkedList<Integer> xPermisos = new LinkedList();
        String sql = "select app_id From Permisos WHERE user_id =";
        Conexion xConexion = Conexion.GetInstance();
        Statement stmt = xConexion.conn.createStatement();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Integer appId = Integer.parseInt(rs.getString(1));
                xPermisos.add(appId);
                
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        int[] xRetorno = new int[xPermisos.size()];
        int i = 0;
        for (Integer x : xPermisos) {
            xRetorno[i] = x;
            i++;
        }
        return xRetorno;
    };
    
    
}
