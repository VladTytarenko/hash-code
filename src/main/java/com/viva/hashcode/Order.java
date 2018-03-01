package com.viva.hashcode;

import static com.viva.hashcode.Order.StatusOrder.WAIT;

public class Order {
    private int minStartTime;
    private int maxFinishTime;
    private Location startLocation;
    private Location finishLocation;
    StatusOrder statusOrder;

    public Order(Location startLocation, Location finishLocation, int minStartTime, int maxFinishTime) {
        this.minStartTime = minStartTime;
        this.maxFinishTime = maxFinishTime;
        this.startLocation = startLocation;
        this.finishLocation = finishLocation;
        this.statusOrder = WAIT;
    }

    Location getCurrentTaget() {
        if (statusOrder == WAIT) {
            return startLocation;
        } else {
            return finishLocation;
        }
    }

    enum StatusOrder {
        WAIT, IN_PROGRES, FINISHED
    }
}
