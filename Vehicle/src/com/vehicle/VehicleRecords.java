package com.vehicle;

import java.io.*;
import java.util.*;

public class VehicleRecords {

    static void writeVehicles() {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("Vehicles.txt"));

            Vehicle[] v = {
                    new Vehicle(1, "Honda", "Sedan", 500000),
                    new Vehicle(2, "Maruti", "Hatchback", 300000),
                    new Vehicle(3, "Yamaha", "Bike", 150000),
                    new Vehicle(4, "Tata", "SUV", 800000),
                    new Vehicle(5, "Test", "Invalid", -20000),
                    new Vehicle(6, "POLO", "COUPE", 200000)
            };

            for (Vehicle vehicle : v) {
                if (vehicle.getPrice() > 0) {
                    String line = vehicle.getVehicleId() + "," + vehicle.getModel() + "," +
                                  vehicle.getType() + "," + vehicle.getPrice();
                    out.write(line);
                    out.newLine();
                }
            }

            out.close();
            System.out.println("Vehicles saved in file.");
        } catch (IOException e) {
            System.out.println("Error writing file"
            		+ ": " + e);
        }
    }

    static void readVehicles() {
        ArrayList<Vehicle> list = new ArrayList<>();

        try {
            BufferedReader in = new BufferedReader(new FileReader("Vehicles.txt"));
            String line;

            while ((line = in.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0]);
                    String model = parts[1];
                    String type = parts[2];
                    double price = Double.parseDouble(parts[3]);

                    list.add(new Vehicle(id, model, type, price));
                }
            }

            in.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }

        Collections.sort(list, (a, b) -> Double.compare(b.getPrice(), a.getPrice()));

        System.out.println("Vehicle Records:");
        for (Vehicle v : list) {
            System.out.println(v);
        }
    }

    public static void main(String[] args) {
        writeVehicles();
        readVehicles();
    }
}
