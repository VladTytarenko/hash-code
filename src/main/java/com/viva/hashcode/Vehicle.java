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

    void move() {
        Location target = order.getCurrentTaget();

        if (currentLocation.getY() != target.getY()) {
            if (currentLocation.getY() < target.getY()) {
                currentLocation.setY(currentLocation.getY() + 1);
            } else {
                currentLocation.setY(currentLocation.getY() - 1);
            }
        } else {
            if (currentLocation.getX() != target.getX()) {
                if (currentLocation.getX() < target.getX()) {
                    currentLocation.setX(currentLocation.getX() + 1);
                } else {
                    currentLocation.setX(currentLocation.getX() - 1);
                }
            }
        }
    }
}
