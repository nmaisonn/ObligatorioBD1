/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;

import Data.DAO.PreguntaDAO;
import Data.Modelos.PreguntaModel;
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
                PreguntaDTO xPregunta = new PreguntaDTO(xPreguntaBD.PregId, xPreguntaBD.Pregunta);
                return xPregunta;
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        return null;
    }

    public static PreguntaDTO[] getPreguntas() {
        try{
             PreguntaModel[] xPreguntasBD = PreguntaDAO.getPreguntas();
        PreguntaDTO[] xPreguntas = null;
        if (xPreguntasBD != null) {
            xPreguntas = new PreguntaDTO[xPreguntasBD.length];
            int i = 0;
            for (PreguntaModel x : xPreguntasBD) {
                PreguntaDTO xPregunta = new PreguntaDTO(x.PregId, x.Pregunta);
                xPreguntas[i] = xPregunta;
                i++;
            }
        }
        return xPreguntas;
        }
        catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }
}
