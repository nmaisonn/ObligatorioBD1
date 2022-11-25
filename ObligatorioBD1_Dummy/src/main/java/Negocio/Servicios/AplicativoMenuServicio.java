/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;



import Data.DAO.AplicativoMenuDAO;
import Data.Modelos.AplicativoMenuModelo;
import Negocio.DTOS.AplicativoMenuDTO;
import java.sql.SQLException;

/**
 *
 * @author prueba
 */
public class AplicativoMenuServicio {
    public static AplicativoMenuDTO getAplicativoMenu(int appId, int menuId){
         try{
            AplicativoMenuModelo xAplicativoMenuBD = AplicativoMenuDAO.getAplicativoMenu(appId,  menuId);
            AplicativoMenuDTO xAppMenu = null;
            if (xAplicativoMenuBD != null) {
                xAppMenu = new AplicativoMenuDTO(xAplicativoMenuBD.AppId, xAplicativoMenuBD.MenuId, xAplicativoMenuBD.Descripcion_Menu);
    
            }
            return xAppMenu;
        }
        catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }
}
