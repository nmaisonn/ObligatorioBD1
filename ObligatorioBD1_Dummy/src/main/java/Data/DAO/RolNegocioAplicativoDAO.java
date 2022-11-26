/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Data.Modelos.RolNegocioAplicativoModelo;
import Negocio.DTOS.RolNegocioAplicativoDTO;
import Recursos.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author prueba
 */
public class RolNegocioAplicativoDAO {
    public static RolNegocioAplicativoModelo[] getRolesNegocioAplicativoByIds(int pRolNeg, int pAppId) throws SQLException{
        LinkedList<RolNegocioAplicativoModelo> xRoles = new LinkedList();
        String r = Integer.toString(pRolNeg);
        String a = Integer.toString(pAppId);
        String sql = "select * from Roles_Negocio_Aplicativos where app_id=" + r + "and rol_neg_id=" + a; 
        Conexion xConexion = Conexion.GetInstance();
        Statement stmt = xConexion.conn.createStatement();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int rolNeg = Integer.parseInt(rs.getString(1));
                int appId = Integer.parseInt(rs.getString(2));
                int rolId = Integer.parseInt(rs.getString(3));
                xRoles.add(new RolNegocioAplicativoModelo( rolNeg, appId, rolId));
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        RolNegocioAplicativoModelo[] xRetorno = new RolNegocioAplicativoModelo[xRoles.size()];
        int i = 0;
        for (RolNegocioAplicativoModelo x : xRoles) {
            xRetorno[i] = x;
            i++;
        }
        return xRetorno;
    }
}
