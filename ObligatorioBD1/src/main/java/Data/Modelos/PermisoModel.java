/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.Modelos;

/**
 *
 * @author nmais
 */
public class PermisoModel {
    public int UserId;
    public int RolNegId;
    public int AppId;
    public String FechaSolicitud;
    public String FechaAutorizacion;
    public String Estado;

    
    public PermisoModel( int pUserId, int rolNegId, int appId,String fechaSolicitud,String fechaAutorizacion,String estado){
        this.UserId = pUserId;
        this.RolNegId = rolNegId;
        this.AppId = appId;
        this.FechaSolicitud = fechaSolicitud;
        this.FechaAutorizacion = fechaAutorizacion;
        this.Estado = estado;
        
    }
}
