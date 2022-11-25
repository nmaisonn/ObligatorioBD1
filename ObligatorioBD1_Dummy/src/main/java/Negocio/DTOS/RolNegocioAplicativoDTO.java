/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.DTOS;

/**
 *
 * @author prueba
 */
public class RolNegocioAplicativoDTO {
    public int RolNegAppId;
    public int AppId;
    public int RolId;
    
    public RolNegocioAplicativoDTO(int rolNegAppId,int appId, int rolId ){
        this.RolNegAppId = rolNegAppId;
        this.AppId = appId;
        this.RolId = rolId;
    }
}
