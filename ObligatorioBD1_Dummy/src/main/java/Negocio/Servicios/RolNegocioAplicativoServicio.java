/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;


import Data.DAO.RolNegocioAplicativoDAO;
import Data.Modelos.RolNegocioAplicativoModelo;
import Negocio.DTOS.RolNegocioAplicativoDTO;
import java.sql.SQLException;

/**
 *
 * @author prueba
 */
public class RolNegocioAplicativoServicio {
    
    public static  RolNegocioAplicativoDTO[] getRolesNegocioAplicativoByIds(int rolNeg, int appId) {
        try{
            RolNegocioAplicativoModelo[] xRolesNegAppBD = RolNegocioAplicativoDAO.getRolesNegocioAplicativoByIds(rolNeg, appId);
            RolNegocioAplicativoDTO[] xRolesNegApp = null;
            if (xRolesNegAppBD != null) {
                xRolesNegApp = new RolNegocioAplicativoDTO[xRolesNegAppBD.length];
                int i = 0;
                for (RolNegocioAplicativoModelo x : xRolesNegAppBD) {
                    RolNegocioAplicativoDTO xRolNegApp = new RolNegocioAplicativoDTO(x.RolNegAppId,x.AppId,x.RolId);
                    xRolesNegApp[i] = xRolNegApp;
                    i++;
                }
            }
            return xRolesNegApp;
        }
        catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }     
}
