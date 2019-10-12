package com.busurca;

class Kia extends PolyChallengeCar {

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
