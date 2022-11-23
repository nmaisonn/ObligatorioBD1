/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.DTOS;

/**
 *
 * @author prueba
 */
public class AplicativoDTO {
    public String NombreApp;
    public int AppId;
    
    public AplicativoDTO(int appId, String nombreApp){
        this.AppId = appId;
        this.NombreApp = nombreApp;
    }
}
