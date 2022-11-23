/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.Modelos;

/**
 *
 * @author nmais
 */
public class RolNegocioAplicativoModel {
    public int RolNegId;
    public int AppId;
    public int RolId;
    
    public RolNegocioAplicativoModel(int pRolNegId, int pAppId, int pRolId)
    {
        this.RolNegId=pRolNegId;
        this.AppId=pAppId;
        this.RolId=pRolId;
    }
}
