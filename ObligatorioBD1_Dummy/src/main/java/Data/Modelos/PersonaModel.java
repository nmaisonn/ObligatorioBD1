/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data.Modelos;

/**
 *
 * @author nmais
 */
public class PersonaModel {
    
    public int UserId;
    public String Nombre;
    public String Apellido;
    public String Direccion;
    public String Ciudad;
    public String Departamento;
    public String Hashpwd;
    
    public PersonaModel(int pUserId, String pNombre, String pApellido, String pDireccion, String pCiudad, String pDepartamento, String pPassword){
    this.UserId = pUserId;
    this.Nombre = pNombre;
    this.Apellido = pApellido;
    this.Direccion = pDireccion;
    this.Ciudad = pCiudad;
    this.Departamento = pDepartamento;
    this.Hashpwd = pPassword;
    }
    
    
    
}
