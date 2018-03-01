package java.com.viva.hashcode;

import static com.viva.hashcode.Order.StatusOrder.NOT_MAPPED;
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
    }
}
