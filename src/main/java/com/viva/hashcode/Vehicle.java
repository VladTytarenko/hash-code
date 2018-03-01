package com.viva.hashcode;

public class Vehicle {
    private Location currentLocation;
    private Order order;

    public Vehicle() {
        this.currentLocation = new Location();
        order = null;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
