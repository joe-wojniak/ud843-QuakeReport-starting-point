package com.example.android.quakereport;

// Example code adapted from androidhive
// https://www.androidhive.info/2016/01/android-working-with-recycler-view/
//

public class Earthquake {
    private String magnitude, city, date;

    public Earthquake() {
        // public constructor for Earthquake
    }

    public Earthquake(String magnitude, String city, String date) {
        this.magnitude = magnitude;
        this.city = city;
        this.date = date;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String mag) {
        this.magnitude = mag;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}