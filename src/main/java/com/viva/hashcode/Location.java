package com.viva.hashcode;

import java.util.Objects;

public class Location {
    private int x;
    private int y;

    public Location() {
        this.x = 0;
        this.y = 0;
    }

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + x +  "  y:" + y;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Location)) return false;
        Location location = (Location) object;
        return getX() == location.getX() &&
                getY() == location.getY();
    }

}
