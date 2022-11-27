/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio.Servicios;

import Data.DAO.PersonaDAO;
import Data.Modelos.PersonaModel;
import Negocio.DTOS.PersonaDTO;
import Recursos.Hashing;
import java.sql.SQLException;

/**
 *
 * @author nmais
 */
public class PersonaServicio {

    public static PersonaDTO getPersonaByUserId(int pUserId) {
        try {
            PersonaModel xPersonaBD = PersonaDAO.getPersonaByUserId(pUserId);
            if (xPersonaBD != null) {
                String passwd = xPersonaBD.Hashpwd; //Falta deshasheo 
                PersonaDTO xPersona = new PersonaDTO(xPersonaBD.UserId, xPersonaBD.Nombre,
                        xPersonaBD.Apellido, xPersonaBD.Direccion, xPersonaBD.Ciudad,
                        xPersonaBD.Departamento, xPersonaBD.Hashpwd);
                return xPersona;
            }
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
        return null;
    }

    public static void createPersona(PersonaDTO pPersona) throws SQLException {
        try {
            String hashpwd = Hashing.DoHash(pPersona.Password);
            PersonaModel xPersona = new PersonaModel(pPersona.UserId, pPersona.Nombre, pPersona.Apellido, pPersona.Direccion, pPersona.Ciudad, pPersona.Departamento, hashpwd);
            PersonaDAO.createPersona(xPersona);
        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }

    public static void changePassword(PersonaDTO pPersona) throws SQLException {
        PersonaModel xPersona = new PersonaModel(pPersona.UserId, pPersona.Nombre, pPersona.Apellido, pPersona.Direccion, pPersona.Ciudad, pPersona.Departamento, pPersona.Password);
        PersonaDAO.updatePassword(xPersona);

    }

}
