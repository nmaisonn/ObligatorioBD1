/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;

import Data.DAO.PersonaDAO;
import Data.Modelos.PersonaModel;
import Negocio.DTOS.PersonaDTO;
import Presentacion.Registro;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author nmais
 */
public class PersonaServicio {

    public static PersonaDTO getPersonaByUserId(int pUserId) {
        try {
            PersonaModel xPersonaBD = PersonaDAO.getPersonaByUserId(pUserId);
            if(xPersonaBD != null)
            {
                //Pasar hash a contraseña
                String passwd ="";//Deshasheo 
                PersonaDTO xPersona = new PersonaDTO(xPersonaBD.UserId,xPersonaBD.Nombre,
                        xPersonaBD.Apellido,xPersonaBD.Direccion,xPersonaBD.Ciudad,
                        xPersonaBD.Departamento, passwd);
            return xPersona;
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        return null;
    }
    
    public static void createPersona(PersonaDTO pPersona)throws SQLException{
        try {
            String hashpwd = pPersona.Password; //Falta hacer el hash
            PersonaModel xPersona = new PersonaModel(pPersona.UserId,pPersona.Nombre,pPersona.Apellido,pPersona.Direccion,pPersona.Ciudad,pPersona.Departamento,hashpwd);
            PersonaDAO.createPersona(xPersona);
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    
    }
}
