/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;


import Data.Modelos.RolAplicativoModelo;
import Recursos.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author prueba
 */
public class RolAplicativoDAO {
    
     public static RolAplicativoModelo[] getRoles(int appIdBD) throws SQLException{
        LinkedList<RolAplicativoModelo> xRoles = new LinkedList();
        String id = Integer.toString(appIdBD);
        String sql = "select * from Roles_Aplicativos where app_id=" + id; //cambiar
        Conexion xConexion = Conexion.GetInstance();
        Statement stmt = xConexion.conn.createStatement();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int appId = Integer.parseInt(rs.getString(1));
                int rolAppId = Integer.parseInt(rs.getString(2));
                String descripcion = rs.getDate(4).toString();
                xRoles.add(new RolAplicativoModelo( appId, rolAppId, descripcion));
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        RolAplicativoModelo[] xRetorno = new RolAplicativoModelo[xRoles.size()];
        int i = 0;
        for (RolAplicativoModelo x : xRoles) {
            xRetorno[i] = x;
            i++;
        }
        return xRetorno;
    };
}
