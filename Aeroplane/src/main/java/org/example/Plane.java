package org.example;

public class Plane {
    private PlaneType planeType;
    private double weight;
    private int capacity;

    public Plane(PlaneType planeType, double weight, int capacity) {
        this.planeType = planeType;
        this.weight = weight;
        this.capacity = capacity;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
