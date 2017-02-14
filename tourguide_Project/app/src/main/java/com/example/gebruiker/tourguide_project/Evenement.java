package com.example.gebruiker.tourguide_project;

/**
 * Created by Gebruiker on 8-2-2017.
 */

public class Evenement {

    private int afbeelding;
    private String naam;
    private String tijd;
    private String tweedenaam;
    private String url;

    public Evenement(String gegevennaam, String gegeventweedenaam, String gegeventijd , int gegevenafbeelding , String geturl){
        afbeelding = gegevenafbeelding;
        naam = gegevennaam;
        tijd = gegeventijd;
        tweedenaam = gegeventweedenaam;
        url = geturl;
    }

    public int getafbeelding(){
        return afbeelding;
    }

    public String getnaam(){
        return naam;
    }

    public String getnaam2(){
        return tweedenaam;
    }

    public String getUrl(){
        return url;
    }
    public String gettijd(){
        return tijd;
    }
}
