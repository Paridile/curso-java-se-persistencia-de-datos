/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paridile.mensajes_app.gatos_app;

import com.google.gson.Gson;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * @author j.rios.diaz.de.leon
 */
public class GatosService {
    public static void verGatos() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
            .build();
        Request request = new Request.Builder()
            .url("https://api.thecatapi.com/v1/images/search?limit=5&page=10&order=Desc")
            .method("GET", null)
            .build();
        Response response = client.newCall(request).execute();
        String json = response.body().string();
        
        //Eliminar corchetes
        json = json.substring(1,json.length());
        json = json.substring(0,json.length()-1);
        
        //Convertit a class
        Gson gson = new Gson();
        Gatos gatos = gson.fromJson(json, Gatos.class);
        
        // Redimensionar imagen
        Image image = null;
        try {
            URL url = new URL(gatos.getUrl());
            image = ImageIO.read(url);
            ImageIcon fondoGato = new ImageIcon();
            if(fondoGato.getIconWidth() > 800) {
                Image fondo = fondoGato.getImage();
                Image modificada = fondo.getScaledInstance(800, 600, java.awt.Image.SCALE_SMOOTH);
                fondoGato = new ImageIcon(modificada);
            }
        }catch(Exception e) {e.printStackTrace();}
    }
}
