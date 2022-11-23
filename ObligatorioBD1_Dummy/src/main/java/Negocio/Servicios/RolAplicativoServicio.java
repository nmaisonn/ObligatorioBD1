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
    
    public static RolAplicativoDTO[] getRolesAplicativos(int id) {
        try{
            RolAplicativoModelo[] xRolesAplicativosBD = RolAplicativoDAO.getRoles(id);
            RolAplicativoDTO[] xRolesAplicativos = null;
            if (xRolesAplicativosBD != null) {
                xRolesAplicativos = new RolAplicativoDTO[xRolesAplicativosBD.length];
                int i = 0;
                for (RolAplicativoModelo x : xRolesAplicativosBD) {
                    RolAplicativoDTO xRolAplicativo = new RolAplicativoDTO(x.AppId,x.RolId,x.Descripcion);
                    xRolesAplicativos[i] = xRolAplicativo;
                    i++;
                }
            }
            return xRolesAplicativos;
        }
        catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }
}
