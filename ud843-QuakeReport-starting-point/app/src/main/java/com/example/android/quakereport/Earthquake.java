package com.example.android.quakereport;

/**
 * Created by Gebruiker on 16-2-2017.
 */

public class Earthquake {
    double mag;
    String time;
    String place;

    public Earthquake(String place, double mag, String time) {
        this.place = place;
        this.mag = mag;
        this.time = time;
    }

    public String getMag() {
        String mag = String.valueOf(this.mag);
        return mag;
    }

    public String getTime() {
        return time;
    }

    public String getPlace() {
        return place;
    }
}
