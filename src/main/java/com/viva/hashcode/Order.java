package com.viva.hashcode;

<<<<<<< Updated upstream
import static com.viva.hashcode.Order.StatusOrder.NOT_MAPPED;
=======

import static java.com.viva.hashcode.Order.StatusOrder.NOT_MAPPED;
import static java.com.viva.hashcode.Order.StatusOrder.WAIT;
>>>>>>> Stashed changes

public class Order {
    private int minStartTime;
    private int maxFinishTime;
    private Location startLocation;
    private Location finishLocation;
    private StatusOrder statusOrder;

    public Order(Location startLocation, Location finishLocation, int minStartTime, int maxFinishTime) {
        this.minStartTime = minStartTime;
        this.maxFinishTime = maxFinishTime;
        this.startLocation = startLocation;
        this.finishLocation = finishLocation;
        this.statusOrder = NOT_MAPPED;
    }

    Location getCurrentTaget() {
        if (statusOrder == NOT_MAPPED) {
            return startLocation;
        } else {
            return finishLocation;
        }
    }

    enum StatusOrder {
        NOT_MAPPED, WAIT, IN_PROGRES, FINISHED
<<<<<<< Updated upstream
=======
    }

    public StatusOrder getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(StatusOrder statusOrder) {
        this.statusOrder = statusOrder;
>>>>>>> Stashed changes
    }
}
