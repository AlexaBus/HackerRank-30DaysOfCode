package com.busurca;

class Volvo extends PolyChallengeCar {

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
