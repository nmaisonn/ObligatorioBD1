/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;

import java.sql.SQLException;
import Negocio.DTOS.PermisoDTO;
import Data.Modelos.PermisoModelo;
import Data.DAO.PermisoDAO;

/**
 *
 * @author prueba
 */
public class PermisoServicio {
   
     
     
   
     public static PermisoDTO[] getPermisos() {
        try{
            PermisoModelo[] xPermisosBD = PermisoDAO.getPermisos();
            PermisoDTO[] xPermisos = null;
            if (xPermisosBD != null) {
                xPermisos = new PermisoDTO[xPermisosBD.length];
                int i = 0;
                for (PermisoModelo x : xPermisosBD) {
                    PermisoDTO xPermiso = new PermisoDTO(x.UserId, x.RolNegId, 
                            x.AppId,x.FechaSolicitud,x.FechaAutorizacion, x.Estado);
                    xPermisos[i] = xPermiso;
                    i++;
                }
            }
            return xPermisos;
        }
        catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }
}
