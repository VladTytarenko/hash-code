package com.viva.hashcode;

import com.sun.tools.corba.se.idl.constExpr.Or;

import java.util.ArrayList;
import java.util.List;

import static com.viva.hashcode.Order.StatusOrder.NOT_MAPPED;
import static java.lang.Math.abs;

public class City {
    private List<Vehicle> vehicleList;
    private List<Order> orderList;
    private int height;
    private int width;

    public City(int width, int height, int vehicleNumber) {
        this.width = width;
        this.height = height;
        vehicleList = new ArrayList<Vehicle>();
        for (int i = 0; i < vehicleNumber; i++) {
            vehicleList.add(new Vehicle());
        }
        //this.orderList = orderList;
    }

    public City(int width, int height, int vehicleNumber, List<Order> orderList) {
        this.width = width;
        this.height = height;
        for (int i = 0; i < vehicleNumber; i++) {
            vehicleList.add(new Vehicle());
        }
        this.orderList = orderList;
    }

    int countDistance(Location locationOne, Location locationTwo) {
        return abs(locationOne.getX() - locationTwo.getX()) + abs(locationTwo.getY() - locationOne.getY());
    }

    List<Vehicle> getFreeVehicle() {
        List<Vehicle> freeVehicle = new ArrayList<Vehicle>();
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getOrder() == null) {
                freeVehicle.add(vehicleList.get(i));
            }
        }
        return freeVehicle;
    }

    public void mapVehiclesOrder() {
        List<Vehicle> freeVehicles = new ArrayList<Vehicle>();
        List<Order> freeOrders = new ArrayList<Order>();
        for (int i = 0; i < freeVehicles.size(); i++) {
            freeVehicles.get(i).setOrder(freeOrders.get(i));
        }
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public List<Order> getFreeOrderList() {
        List<Order> freeOrders = new ArrayList<Order>();
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).statusOrder == NOT_MAPPED) {
                freeOrders.add(orderList.get(i));
            }
        }

        return orderList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
