/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paridile.mensajes_app.gatos_app;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author j.rios.diaz.de.leon
 */
public class Inicio {
    public static void main(String[] args) {
        int opc = -1;
        String[] botones = {
            "1. Ver gatos",
            "2. Salir"
        };
        do{
            String opcion = (String)JOptionPane.showInputDialog(null,"Gatos java","Menu principal",JOptionPane.INFORMATION_MESSAGE,null,botones,botones[0]);
            for(int i = 0 ; i < botones.length;i++) {
                if(opcion.equals(botones[i])) {
                    opc=i;
                }
            }
            switch(opc) {
                case 0:
                {
                    try {
                        GatosService.verGatos();
                    } catch (IOException ex) {
                        Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    break;

                default:
                    break;
            }
        }while(opc != 1);
    }
}
