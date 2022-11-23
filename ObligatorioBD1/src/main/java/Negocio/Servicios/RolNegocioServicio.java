/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;

import Data.DAO.RolNegocioDAO;
import Data.Modelos.RolNegocioModel;
import Negocio.DTOS.RolNegocioDTO;
import java.sql.SQLException;

/**
 *
 * @author nmais
 */
public class RolNegocioServicio {

    public static RolNegocioDTO getRolNegocioById(int pRolNegId) throws SQLException {
        RolNegocioModel xRolNegocioModel = RolNegocioDAO.getRolNegocioById(pRolNegId);
        if(xRolNegocioModel!= null)
        {
            RolNegocioDTO xRolNegocioDTO = new RolNegocioDTO(xRolNegocioModel.RolNegId,xRolNegocioModel.DescripcionRolNeg);
            return xRolNegocioDTO;
        }
        return null;
    }

}
