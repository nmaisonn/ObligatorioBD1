/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.DTOS;

/**
 *
 * @author prueba
 */
public class AplicativoMenuDTO {
    public int AppId;
    public int MenuId;
    public String Descripcion_Menu;
    
    public AplicativoMenuDTO(int appId, int menuId, String descripcion){
        this.AppId = appId;
        this.MenuId = menuId;
        this.Descripcion_Menu = descripcion;
    }
}
