package com.busurca;

class PolyChallengeCar {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int currentSpeed;

    public PolyChallengeCar(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.currentSpeed = 0;
    }

    public void startEngine() {
        System.out.println("Engine started!");
    }

    public void accelerate(int addedSpeed) {
        currentSpeed += addedSpeed;
        System.out.println("Car travelling at: " + currentSpeed + "kph!");
    }

    public void brake(int slowBy) {
        currentSpeed -= slowBy;
        System.out.println("Car slowed down by " + slowBy + "kph and is now travelling at " + currentSpeed + "kph!");
    }

    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
