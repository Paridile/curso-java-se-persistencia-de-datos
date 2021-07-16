/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paridile.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author j.rios.diaz.de.leon
 */
public class MensajesService {
    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        
        MensajesDAO.crearMensajeDB(registro); 
    }
    
    public static void listarMensajes() {
        MensajesDAO.leerMensajesDB();
    }
    
    public static void borrarMensaje() {
    
    }
    
    public static void editarMensaje() {
    
    }
}
