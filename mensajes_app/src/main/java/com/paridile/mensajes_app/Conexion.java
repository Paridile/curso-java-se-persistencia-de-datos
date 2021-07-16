/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paridile.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author j.rios.diaz.de.leon
 */
public class Conexion {
    public Connection getConnection() {  
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:6033/mensajes_app?serverTimezone=UTC","root","");
            System.out.println(connection != null ? "Conexion realizada con exito" : "Hubo un problema al realizar la conexion");            
        } catch(Exception e) {
            e.printStackTrace();
        } finally {           
        }
        return connection;
    }
}
