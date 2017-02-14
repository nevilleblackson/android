package com.example.gebruiker.multiscreenapps_project;

/**
 * Created by Gebruiker on 8-2-2017.
 */

public class Evenement {

    private int afbeelding;
    private String naam;
    private String text3;
    private String tweedenaam;
    private String url = NO_URL;
    private static final String NO_URL = null ;

    public Evenement(String gegevennaam, String gegeventweedenaam, String gegeventijd , int gegevenafbeelding , String geturl){
        afbeelding = gegevenafbeelding;
        naam = gegevennaam;
        text3 = gegeventijd;
        tweedenaam = gegeventweedenaam;
        url = geturl;
    }

    public Evenement(String gegevennaam, String gegeventweedenaam, String gegeventijd , int gegevenafbeelding ,boolean noimg){
        afbeelding = gegevenafbeelding;
        naam = gegevennaam;
        text3 = gegeventijd;
        tweedenaam = gegeventweedenaam;
    }

    public Evenement(String dag, String weerdag, String weernacht , int gegevenafbeelding){
        afbeelding = gegevenafbeelding;
        naam = dag;
        text3 = weerdag;
        tweedenaam = weernacht;
    }

    public Evenement(String Naam, String uitleg , int gegevenafbeelding){
        afbeelding = gegevenafbeelding;
        naam = Naam;
        tweedenaam = uitleg;
        text3 = "";
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

    public String text3(){
        return text3;
    }
}
