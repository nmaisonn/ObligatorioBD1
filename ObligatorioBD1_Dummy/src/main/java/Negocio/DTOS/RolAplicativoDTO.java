/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.DTOS;

/**
 *
 * @author prueba
 */
public class RolAplicativoDTO {
    public int  AppId;
    public int RolId;
    public String Descripcion;
    
    public RolAplicativoDTO(int appId, int rolId, String descripcion){
        this.AppId = appId;
        this.RolId = rolId;
        this.Descripcion = descripcion;
    }
}
