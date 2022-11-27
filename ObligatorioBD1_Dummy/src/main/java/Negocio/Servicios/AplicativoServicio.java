/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;

import Data.DAO.AplicativoDAO;
import Data.Modelos.AplicativoModelo;
import Negocio.DTOS.AplicativoDTO;
import java.sql.SQLException;

/**
 *
 * @author prueba
 */
public class AplicativoServicio {
    
    public static AplicativoDTO[] getAppIdByUserId(int id) {
        try{
            int [] appIds = PermisoServicio.getAppIdByUserId(id);
            AplicativoModelo[] xAplicativosBD = new AplicativoModelo[appIds.length];
            int i = 0;
            for (int x: appIds){
                AplicativoModelo xAplicativoBD = AplicativoDAO.getAplicativo(x);
                xAplicativosBD[i] = xAplicativoBD;
                i++;    
            }
            AplicativoDTO[] xAplicativos = null;
            if (xAplicativosBD != null) {
                xAplicativos = new AplicativoDTO[xAplicativosBD.length];
                 i = 0;
                for (AplicativoModelo x : xAplicativosBD) {
                    AplicativoDTO xAplicativo = new AplicativoDTO(x.AppId,x.NombreApp);
                    xAplicativos[i] = xAplicativo;
                    i++;
                }
            }
            
            return xAplicativos;
        }
        catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }

    
}
