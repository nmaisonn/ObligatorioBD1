/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.DTOS;

/**
 *
 * @author nmais
 */
public class PreguntaDTO {
    public int PregId;
    public String Pregunta;
    
    public PreguntaDTO(int pPregId, String pPregunta){
        this.PregId = pPregId;
        this.Pregunta =pPregunta;
    }
}
