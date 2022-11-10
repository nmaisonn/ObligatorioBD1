/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;

import Data.DAO.PersonaDAO;
import Negocio.DTOS.PersonaDTO;
import java.sql.SQLException;

/**
 *
 * @author nmais
 */
public class PersonaServicio {

    public static boolean getPersonaByUserId(int pUserId) {
        try {
            return PersonaDAO.getPersonaByUserId(pUserId);
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }
    
    public static void createPersona(PersonaDTO pPersona){
        try {
            PersonaDAO.createPersona(pPersona);
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    
    }
}
