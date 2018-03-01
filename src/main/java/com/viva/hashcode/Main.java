package com.viva.hashcode;

public class Main {

    public static void main(String[] args) {
        FileScanner fileScanner = new FileScanner("/Users/Vitaliy/IdeaProjects/hash-code/src/java/resources/a_example.in");
        City exampleCity = fileScanner.getCity();
        System.out.println(exampleCity);
        System.out.println(exampleCity.getVehicleList().size());



    }


}
