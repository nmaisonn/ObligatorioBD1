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
public class PreguntaServicio {

    public static PersonaDTO getPreguntaByPregunta(int pUserId) {
        try {
            PersonaModel xPersonaBD = PersonaDAO.getPersonaByUserId(pUserId);
            if (xPersonaBD != null) {
                //Pasar hash a contraseña
                String passwd = "";//Deshasheo 
                PersonaDTO xPersona = new PersonaDTO(xPersonaBD.UserId, xPersonaBD.Nombre,
                        xPersonaBD.Apellido, xPersonaBD.Direccion, xPersonaBD.Ciudad,
                        xPersonaBD.Departamento, passwd);
                return xPersona;
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        return null;
    }
}
