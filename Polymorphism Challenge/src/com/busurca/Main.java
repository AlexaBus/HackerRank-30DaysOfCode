package com.busurca;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int currentSpeed;

    public Car(String name, int cylinders) {
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

class Kia extends Car {

    public Kia() {
        super("Kia", 4);
    }

    @Override
    public void startEngine(){
        System.out.println("Your Kia's engine is switched on");
    }

    @Override
    public void accelerate(int addedSpeed){
        setCurrentSpeed(getCurrentSpeed() + addedSpeed);
        System.out.println("Your " + getName() + " is now travelling at " + getCurrentSpeed() + "kph");
    }

    @Override
    public void brake(int slowBy){
        setCurrentSpeed(getCurrentSpeed() - slowBy);
        System.out.println("Your " + getName() + " slowed down by " + slowBy + " kph and is now cruising at " + getCurrentSpeed() + " kph!");
    }
}

class Volvo extends Car {

    public Volvo() {
        super("Volvo", 8);
    }

    @Override
    public void startEngine(){
        System.out.println("Your " + getName() + "'s engine is on");
    }

    @Override
    public void accelerate(int addedSpeed){
        setCurrentSpeed(getCurrentSpeed() + addedSpeed);
        System.out.println("Your " + getName() + " is now cruising at " + getCurrentSpeed() + "kph");
    }

    @Override
    public void brake(int slowBy){
        setCurrentSpeed(getCurrentSpeed() - slowBy);
        System.out.println("Your " + getName() + " slowed down by " + slowBy + " kph and is now speeding at " + getCurrentSpeed() + " kph!");
    }
}

class Chrysler extends Car {

    public Chrysler() {
        super("Chrysler", 8);
    }

    @Override
    public void startEngine(){
        System.out.println("Your " + getName() + "'s engine is on");
    }

    @Override
    public void accelerate(int addedSpeed){
        setCurrentSpeed(getCurrentSpeed() + addedSpeed);
        System.out.println("Your " + getName() + " is now cruising at " + getCurrentSpeed() + "kph");
    }

    @Override
    public void brake(int slowBy){
        setCurrentSpeed(getCurrentSpeed() - slowBy);
        System.out.println("Your " + getName() + " slowed down by " + slowBy + " kph and is now speeding at " + getCurrentSpeed() + " kph!");
    }
}




public class Main {

    public static void main(String[] args) {
        Car kia = new Kia();
        Car volvo = new Volvo();
        kia.startEngine();
        volvo.startEngine();
        kia.accelerate(50);
        volvo.accelerate(50);
        kia.brake(10);
        volvo.accelerate(100);
        kia.accelerate(100);
        Chrysler chrysler = new Chrysler();
        chrysler.accelerate(1000);
    }
}
