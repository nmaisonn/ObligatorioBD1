/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.DTOS;


/**
 *
 * @author nmais
 */
public class PermisoDTO {
    public int UserId;
    public int RolNegId;
    public int AppId;
    public String FechaSolicitud;
    public String FechaAutorizacion;
    public String Estado;

    
    public PermisoDTO( int pUserId, int rolNegId, int appId){
        this.UserId = pUserId;
        this.RolNegId = rolNegId;
        this.AppId = appId;
        this.FechaSolicitud = java.time.LocalDateTime.now().toString();
        this.FechaAutorizacion = null;
        this.Estado = "Pendiente";
        
    }
}
