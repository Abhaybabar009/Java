package com.vehicle;

public class Vehicle {
    private int vehicleId;
    private String model;
    private String type;
    private double price;

    public Vehicle(int vehicleId, String model, String type, double price) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.type = type;
        this.price = price;
    }

    public int getVehicleId() { return vehicleId; }
    public String getModel() { return model; }
    public String getType() { return type; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "ID: " + vehicleId + ", Model: " + model + ", Type: " + type + ", Price: " + price;
    }
}
