/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.DTOS;

/**
 *
 * @author nmais
 */
public class PersonaPreguntaDTO {
    public int UserId;
    public int PregId;
    public String Respuesta;
    
    public PersonaPreguntaDTO(int pUserId,int pPregId, String pRespuesta){
        this.UserId = pUserId;
        this.PregId = pPregId;
        this.Respuesta = pRespuesta;
    }
}
