/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;

import Data.DAO.PersonaDAO;
import Data.DAO.PersonaPreguntaDAO;
import Data.Modelos.PersonaModel;
import Data.Modelos.PersonaPreguntaModel;
import Negocio.DTOS.PersonaDTO;
import Negocio.DTOS.PersonaPreguntaDTO;
import java.sql.SQLException;

/**
 *
 * @author nmais
 */
public class PersonaPreguntaServicio {

    public static PersonaPreguntaDTO crearPersonaPregunta(PersonaPreguntaDTO pPersonaPregunta) throws SQLException {
        PersonaPreguntaModel persPregBD = PersonaPreguntaDAO.getPersPregByUserId(pPersonaPregunta.UserId);
        if (persPregBD != null) {
            PersonaPreguntaDTO persPreg = new PersonaPreguntaDTO(persPregBD.UserId, persPregBD.PregId, persPregBD.Respuesta);
            return persPreg;
        }
        return null;
    }

    public static PersonaPreguntaDTO getPersPregByUserId(int userId) {
        try {
            PersonaPreguntaModel persPregBD = PersonaPreguntaDAO.getPersPregByUserId(userId);
            if (persPregBD != null) {
                PersonaPreguntaDTO persPreg = new PersonaPreguntaDTO(persPregBD.UserId, persPregBD.PregId, persPregBD.Respuesta);
                return persPreg;
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        return null;
    }
}
