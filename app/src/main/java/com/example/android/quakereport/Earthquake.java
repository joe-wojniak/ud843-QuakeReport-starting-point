package com.example.android.quakereport;

// Example code adapted from androidhive
// https://www.androidhive.info/2016/01/android-working-with-recycler-view/
//

public class Earthquake {
    private String magnitude, location, time;

    public Earthquake() {
        // public constructor for Earthquake
    }

    public Earthquake(String magnitude, String location, String time) {
        this.magnitude = magnitude;
        this.location = location;
        this.time = time;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String mag) {
        this.magnitude = mag;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}