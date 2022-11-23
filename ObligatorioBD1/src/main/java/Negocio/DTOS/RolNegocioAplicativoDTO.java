/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.DTOS;

/**
 *
 * @author nmais
 */
public class RolNegocioAplicativoDTO {

    public int RolNegId;
    public int AppId;
    public int RolId;
    
    public RolNegocioAplicativoDTO(int pRolNegId, int pAppId, int pRolId) {
        this.RolNegId = pRolNegId;
        this.AppId = pAppId;
        this.RolId = pRolId;
    }

}
