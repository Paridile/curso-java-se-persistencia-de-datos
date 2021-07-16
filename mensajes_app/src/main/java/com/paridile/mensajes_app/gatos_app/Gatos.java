/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paridile.mensajes_app.gatos_app;

/**
 *
 * @author j.rios.diaz.de.leon
 */
public class Gatos {
    private int id;
    private String url;
    private final String apiKey = "55d1f916-c99e-468e-a7e9-667138257e9b";
    private String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
    
    
}
