package com.viva.hashcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class FileScanner {

    private City city;
    private List<Order> orderList;
    private List<Vehicle> venicleList;
    private int numOfOrders;
    private int bonus;
    private int steps;

    public FileScanner(String fileName) {
        File file = new File(fileName);

        try {

            Scanner sc = new Scanner(file);
            if (sc.hasNextLine()) {
                city = new City(sc.nextInt(), sc.nextInt());
                for (int i = 0; i < sc.nextInt(); i++)
                    venicleList.add(new Vehicle(new Location(0, 0)));
                numOfOrders = sc.nextInt();
                bonus = sc.nextInt();
                steps = sc.nextInt();
            }

            while (sc.hasNextLine())
                orderList.add(new Order(new Location(sc.nextInt(), sc.nextInt()), new Location(sc.nextInt(),
                        sc.nextInt()), sc.nextInt(), sc.nextInt()));

            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public City getCity() {
        return city;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public List<Vehicle> getVenicleList() {
        return venicleList;
    }

    public int getBonus() {
        return bonus;
    }

    public int getSteps() {
        return steps;
    }
}
