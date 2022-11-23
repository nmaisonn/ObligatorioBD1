/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;

import Data.DAO.AplicativoDAO;
import Data.Modelos.AplicativoModel;
import Negocio.DTOS.AplicativoDTO;
import java.sql.SQLException;

/**
 *
 * @author nmais
 */
public class AplicativoServicio {

    public static AplicativoDTO[] getAplicativos() {
        try {

            AplicativoModel[] aplicativosModel = AplicativoDAO.getAplicativos();
            if (aplicativosModel != null) {
                AplicativoDTO[] aplicativosDTO = new AplicativoDTO[aplicativosModel.length];
                int i = 0;
                for (AplicativoModel x : aplicativosModel) {
                    aplicativosDTO[i]= new AplicativoDTO(x.AppId,x.NombreApp);
                    i++;
                }
                return aplicativosDTO;
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        return null;
    }
}
