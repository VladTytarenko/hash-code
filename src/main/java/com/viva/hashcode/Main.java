package com.viva.hashcode;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileScanner fileScanner = new FileScanner("/Users/Vitaliy/IdeaProjects/hash-code/src/java/resources/a_example.in");
        City exampleCity = fileScanner.getCity();
        System.out.println(exampleCity);
        System.out.println(exampleCity.getVehicleList().size());

        for (int i = 0; i < 10; i++) {

            List<Vehicle> lv = exampleCity.getVehicleList();
            List<Vehicle> fv = new ArrayList<Vehicle>();
            for (Vehicle vehicle : lv) {
                if (vehicle.getOrder() == null) {
                    fv.add(vehicle);
                }
            }

            List<Order> lo = exampleCity.getOrderList();
            for (Order order : lo) {
                //if (!order.getFinish() < i) {

                //}
            }

        }

    }
}
