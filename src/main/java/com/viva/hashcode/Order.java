package com.viva.hashcode;

public class Order {
    private int minStartTime;
    private int maxFinishTime;
    private Location startLocation;
    private Location finishLocation;

    public Order(int minStartTime, int maxFinishTime, Location startLocation, Location finishLocation) {
        this.minStartTime = minStartTime;
        this.maxFinishTime = maxFinishTime;
        this.startLocation = startLocation;
        this.finishLocation = finishLocation;
    }
}
