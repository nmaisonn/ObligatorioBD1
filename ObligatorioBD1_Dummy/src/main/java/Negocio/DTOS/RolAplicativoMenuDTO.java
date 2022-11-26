/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.DTOS;

/**
 *
 * @author prueba
 */
public class RolAplicativoMenuDTO {
    public int AppId;
    public int RolId;
    public int MenuId;
    
    
    public RolAplicativoMenuDTO(int appId, int rolId, int menuId){
        this.AppId = appId;
        this.RolId = rolId;
        this.MenuId = menuId;
    }
}
