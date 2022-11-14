/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;


import Data.DAO.PreguntaDAO;
import Data.Modelos.PreguntaModel;
import Negocio.DTOS.PersonaDTO;
import Negocio.DTOS.PreguntaDTO;
import java.sql.SQLException;

/**
 *
 * @author nmais
 */
public class PreguntaServicio {

    public static PreguntaDTO getPreguntaByPregunta(String pPregunta) {
        try {
            PreguntaModel xPreguntaBD = PreguntaDAO.getPreguntaByPregunta(pPregunta);
            if (xPreguntaBD != null) {
                PreguntaDTO xPregunta = new PreguntaDTO(xPreguntaBD.PregId,xPreguntaBD.Pregunta);
                return xPregunta;
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        return null;
    }
}
