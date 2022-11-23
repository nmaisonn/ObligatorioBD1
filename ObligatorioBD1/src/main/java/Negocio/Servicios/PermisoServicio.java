/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;

import Data.DAO.PermisoDAO;
import Data.Modelos.PermisoModel;
import Negocio.DTOS.PermisoDTO;
import java.sql.SQLException;

/**
 *
 * @author nmais
 */
public class PermisoServicio {
    public static void crearSolicitud(PermisoDTO pPermiso) throws SQLException{
        PermisoModel xPermiso = new PermisoModel(pPermiso.UserId,pPermiso.RolNegId,pPermiso.AppId,pPermiso.FechaSolicitud,pPermiso.FechaAutorizacion,pPermiso.Estado);
        PermisoDAO.crearSolicitud(xPermiso);
        
    }
}
