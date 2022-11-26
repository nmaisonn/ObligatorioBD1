/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;


import Data.DAO.RolAplicativoMenuDAO;
import Data.Modelos.RolAplicativoMenuModelo;
import Negocio.DTOS.RolAplicativoMenuDTO;
import java.sql.SQLException;

/**
 *
 * @author prueba
 */
public class RolAplicativoMenuServicio {
    public static RolAplicativoMenuDTO getRolAplicativoMenu(int appId, int rolId){
         try{
            RolAplicativoMenuModelo xRolAplicativoMenuBD = RolAplicativoMenuDAO.getRolAplicativoMenu(appId,  rolId);
            RolAplicativoMenuDTO xRolAppMenu = null;
            if (xRolAplicativoMenuBD != null) {
                xRolAppMenu = new RolAplicativoMenuDTO(xRolAplicativoMenuBD.AppId, 
                        xRolAplicativoMenuBD.RolId, xRolAplicativoMenuBD.MenuId);
    
            }
            return xRolAppMenu;
        }
        catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }
}
