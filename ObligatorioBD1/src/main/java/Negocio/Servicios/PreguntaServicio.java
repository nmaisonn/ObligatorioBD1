/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;

import Data.DAO.PersonaDAO;
import Data.DAO.PreguntaDAO;
import Data.Modelos.PersonaModel;
import Data.Modelos.PreguntaModel;
import Negocio.DTOS.PersonaDTO;
import Negocio.DTOS.PreguntaDTO;
import java.sql.SQLException;

/**
 *
 * @author nmais
 */
public class PreguntaServicio {

    public static PreguntaDTO getPregById(int pregId) {
        try {
            PreguntaModel pregBD = PreguntaDAO.getPreguntaById(pregId);
            if (pregBD != null) {
                //Pasar hash a contraseña
                String passwd = "";//Deshasheo 
                PreguntaDTO preg = new PreguntaDTO(pregBD.PregId, pregBD.Pregunta);
                return preg;
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        return null;
    }

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
