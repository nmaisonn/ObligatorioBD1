/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.DAO;

import Data.Modelos.AplicativoModelo;
import Recursos.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author prueba
 */
public class AplicativoDAO {
    public static AplicativoModelo[] getAplicativos(int id) throws SQLException {
       LinkedList<AplicativoModelo> xAplicativos = new LinkedList();
        String sql = "select * from Aplicativos where app_id = ";

        //select * from Aplicativos where app_id = 
        Conexion xConexion = Conexion.GetInstance();
        Statement stmt = xConexion.conn.createStatement();
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int appId = Integer.parseInt(rs.getString(1));
                String nombreApp = rs.getString(2);
            
                xAplicativos.add(new AplicativoModelo( appId, nombreApp));
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        AplicativoModelo[] xRetorno = new AplicativoModelo[xAplicativos.size()];
        int i = 0;
        for (AplicativoModelo x : xAplicativos) {
            xRetorno[i] = x;
            i++;
        }
        return xRetorno; 
    }
}
