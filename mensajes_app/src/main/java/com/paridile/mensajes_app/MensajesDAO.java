/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paridile.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author j.rios.diaz.de.leon
 */
public class MensajesDAO {
    public static void crearMensajeDB(Mensajes mensaje) {
        Conexion db_connect = new Conexion();
        try(Connection conexion = db_connect.getConnection()) {
            PreparedStatement ps = null;
            try {
               String query = "INSERT INTO `mensajes` (`mensaje`, `autor`, `fecha_mensaje`) VALUES (?,?, current_timestamp())";
               ps= conexion.prepareStatement(query);
               ps.setString(1, mensaje.getMensaje());
               ps.setString(2, mensaje.getAutor_mensaje());
               ps.executeUpdate();
                System.out.println("Mensaje creado");
            }catch(SQLException e) {                
                System.out.println("Ha ocurrido un error al insetar su mensaje");
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void leerMensajesDB() {
  
    }
    
    public static void borrarMensajeDB(int id_mensaje) {
    
    }
    
    public static void actualizarMensaje(Mensajes mensaje) {
    
    }
}
