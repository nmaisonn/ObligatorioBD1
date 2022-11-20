/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.DTOS;

/**
 *
 * @author nmais
 */
public class RolNegocioDTO {
    public int RolNegId;
    public String Descripcion;
    
    public RolNegocioDTO(int pRolNegId, String pDescrcipcion)
    {
        this.RolNegId= pRolNegId;
        this.Descripcion= pDescrcipcion;
    }
}
