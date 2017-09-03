package com.blastic.transcaribeapp.data.model;

import com.google.android.gms.maps.model.LatLng;

/**
 * @author Cristobal Romero Rossi
 *         Created by crross on 3/09/17.
 */

public class Station {
    LatLng coord;
    String name;
    String key;

    public Station(LatLng coord, String name, String key) {
        this.coord = coord;
        this.name = name;
        this.key = key;
    }

    public LatLng getCoord() {
        return coord;
    }

    public void setCoord(LatLng coord) {
        this.coord = coord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
