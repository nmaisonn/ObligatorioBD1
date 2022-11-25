/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;

import Data.DAO.RolAplicativoDAO;
import Data.Modelos.RolAplicativoModelo;
import Negocio.DTOS.RolAplicativoDTO;
import java.sql.SQLException;

/**
 *
 * @author prueba
 */
public class RolAplicativoServicio {
    
    public static RolAplicativoDTO getRolAplicativo(int idApp, int idRol) {
        try{
            RolAplicativoModelo xRolAplicativoBD = RolAplicativoDAO.getRolAplicativo(idApp,  idRol);
            RolAplicativoDTO xRolAplicativo = null;
            if (xRolAplicativoBD != null) {
                xRolAplicativo = new RolAplicativoDTO(xRolAplicativoBD.AppId, xRolAplicativoBD.RolId, xRolAplicativoBD.Descripcion);
    
            }
            return xRolAplicativo;
        }
        catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }
}
