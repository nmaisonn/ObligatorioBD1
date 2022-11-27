/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Data.Modelos.RolNegocioAplicativoModel;
import Recursos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author nmais
 */
public class RolNegocioAplicativoDAO {

    public static RolNegocioAplicativoModel[] getRolNegocioAplicativoByAppId(int pAppId) throws SQLException {
        LinkedList<RolNegocioAplicativoModel> xRolNegocioAplicativoModels = new LinkedList();
        String sql = "select rol_neg_id from Roles_Negocio_Aplicativos where app_id=? group by rol_neg_id";
        Conexion xConexion = Conexion.GetInstance();
        PreparedStatement stmt = xConexion.conn.prepareStatement(sql);
        try {
            stmt.setInt(1, pAppId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                xRolNegocioAplicativoModels.add(new RolNegocioAplicativoModel(Integer.parseInt(rs.getString(1)), pAppId, 0));
            }

        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        if (!xRolNegocioAplicativoModels.isEmpty()) {
            int i = 0;
            RolNegocioAplicativoModel[] xRetorno = new RolNegocioAplicativoModel[xRolNegocioAplicativoModels.size()];
            for (RolNegocioAplicativoModel x : xRolNegocioAplicativoModels) {
                xRetorno[i] = x;
                i++;
            }
            return xRetorno;
        }
        return null;
    }
}
