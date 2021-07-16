/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paridile.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author j.rios.diaz.de.leon
 */
public class Inicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conexion conexion = new Conexion();        
        try(Connection cnx = conexion.getConnection()) {
        
        }catch(Exception e) {
            e.printStackTrace();
        }
        int opc = 0;
        do {
            System.out.println("-______________________-");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. Crear un mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar mensaje");
            System.out.println("4. Eliminar un mensaje");
            System.out.println("5. Salir");
            opc = sc.nextInt();
            switch(opc) {
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3:
                    MensajesService.editarMensaje();
                    break;
                case 4:
                    MensajesService.borrarMensaje();
                    break;
                case 5:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;                    
            }
        }while(opc != 5);
    }
}
