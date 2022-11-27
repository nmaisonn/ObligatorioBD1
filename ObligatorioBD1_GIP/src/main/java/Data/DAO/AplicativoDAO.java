/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Data.Modelos.AplicativoModel;
import Recursos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author nmais
 */
public class AplicativoDAO {

    public static AplicativoModel[] getAplicativos() throws SQLException {
        LinkedList<AplicativoModel> xAplicativos = new LinkedList();

        String sql = "select * from Aplicativos";
        Conexion xConexion = Conexion.GetInstance();
        PreparedStatement stmt = xConexion.conn.prepareStatement(sql);
        try {
            ResultSet rs = stmt.executeQuery();
            int i = 0;
            while (rs.next()) {
                xAplicativos.add(new AplicativoModel(Integer.parseInt(rs.getString(1)), rs.getString(2)));
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        if (!xAplicativos.isEmpty()) {
            int i = 0;
            AplicativoModel[] xRetorno = new AplicativoModel[xAplicativos.size()];
            for (AplicativoModel x : xAplicativos) {
                xRetorno[i] = x;
                i++;
            }
            return xRetorno;
        }
        return null;
    }

    public static AplicativoModel getAplicativoByAppId(int pId) throws SQLException {
        AplicativoModel xAppModel = null;
        String sql = "select * from Aplicativos where app_id= ?";
        Conexion xConexion = Conexion.GetInstance();
        PreparedStatement stmt = xConexion.conn.prepareStatement(sql);
        try {
            stmt.setInt(1, pId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                xAppModel = new AplicativoModel(Integer.parseInt(rs.getString(1)), rs.getString(2));
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        return xAppModel;
    }
}

