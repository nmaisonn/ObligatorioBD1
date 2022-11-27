/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.DTOS;

/**
 *
 * @author nmais
 */
public class AplicativoDTO {
    public int AppId;
    public String NombreApp;
    
    public AplicativoDTO(int pId, String pNombreApp){
        this.AppId=pId;
        this.NombreApp=pNombreApp;
    }
}
