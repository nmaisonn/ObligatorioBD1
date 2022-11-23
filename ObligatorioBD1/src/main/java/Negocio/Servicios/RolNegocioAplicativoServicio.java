/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;

import Data.DAO.RolNegocioAplicativoDAO;
import Data.Modelos.RolNegocioAplicativoModel;
import Negocio.DTOS.RolNegocioAplicativoDTO;
import java.sql.SQLException;

/**
 *
 * @author nmais
 */
public class RolNegocioAplicativoServicio {
    
    public static RolNegocioAplicativoDTO[] getRolNegocioAplicativoByAppId(int pAppId) throws SQLException{
        RolNegocioAplicativoModel[] xRolNegocioAplicativoModel = RolNegocioAplicativoDAO.getRolNegocioAplicativoByAppId(pAppId);
        if(xRolNegocioAplicativoModel != null)
        {
            RolNegocioAplicativoDTO[] xRolNegocioAplicativoDTO= new RolNegocioAplicativoDTO[xRolNegocioAplicativoModel.length];
            int i =0;
            for(RolNegocioAplicativoModel x : xRolNegocioAplicativoModel)
            {
                xRolNegocioAplicativoDTO[i]= new RolNegocioAplicativoDTO(x.RolNegId,x.AppId,x.RolId);
                i++;
            }
            return xRolNegocioAplicativoDTO;
        }
        return null;
    }
}
