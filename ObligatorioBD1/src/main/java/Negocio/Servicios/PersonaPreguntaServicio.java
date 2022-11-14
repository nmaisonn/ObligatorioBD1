/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;

import Data.DAO.PersonaPreguntaDAO;
import Data.Modelos.PersonaPreguntaModel;
import Negocio.DTOS.PersonaPreguntaDTO;
import java.sql.SQLException;

/**
 *
 * @author nmais
 */
public class PersonaPreguntaServicio {
    
   public static void crearPersonaPregunta(PersonaPreguntaDTO pPersonaPregunta)throws SQLException{
        try {
            PersonaPreguntaModel  xPersPreg = new PersonaPreguntaModel(pPersonaPregunta.UserId,pPersonaPregunta.PregId, pPersonaPregunta.Respuesta);
            PersonaPreguntaDAO.crearPersonaPregunta(xPersPreg);
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    
    }
}
