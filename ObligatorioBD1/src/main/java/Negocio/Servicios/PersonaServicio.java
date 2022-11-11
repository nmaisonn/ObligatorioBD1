/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;

import Data.DAO.PersonaDAO;
import Data.Modelos.PersonaModel;
import Negocio.DTOS.PersonaDTO;
import java.sql.SQLException;

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
    
    public static void createPersona(PersonaDTO pPersona){
        try {
            PersonaDAO.createPersona(pPersona);
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    
    }
}
