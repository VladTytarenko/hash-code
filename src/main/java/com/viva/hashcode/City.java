package com.viva.hashcode;

import com.sun.tools.corba.se.idl.constExpr.Or;

import java.util.List;

public class City {
    List<Vehicle> vehicleList;
    List<Order> orderList;
    int height;
    int width;

    public City(int width, int height, int vehicleNumber, List<Order> orderList) {
        this.width = width;
        this.height = height;
        for(int i = 0; i < vehicleNumber; i++) {
            vehicleList.add(new Vehicle());
        }
        this.orderList = orderList;
    }
}
