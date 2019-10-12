package com.busurca.car;

public class Car extends Vehicle {

    /****************
     * My solution *
     ***************/
    /*private String fuelType;
    private int numberOfDoors;
    private int seats;
    private int enginePower;

    public Car(String type, String locomotionType, int gears, String fuelType, int numberOfDoors, int seats, int enginePower) {
        super(type, locomotionType, true, gears);
        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
        this.seats = seats;
        this.enginePower = enginePower;
    }

    public void startEngine(){
        System.out.println("Car engine started");
    }

    public void accelerate(){
        System.out.println("Increase car speed");
    }

    public void brake(){
        System.out.println("Decrease car speed");
    }

    public void changeGear(){
        System.out.println("Car changes gear");
    }

    public void stopEngine(){
        System.out.println("Car engine stops");
    }

    @Override
    public void move() {
        super.move();
        startEngine();
        accelerate();
        changeGear();
    }

    @Override
    public void stop() {
        super.stop();
        brake();
        changeGear();
        stopEngine();
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getSeats() {
        return seats;
    }

    public int getEnginePower() {
        return enginePower;
    }*/

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
        move(speed, direction);

    }

}
