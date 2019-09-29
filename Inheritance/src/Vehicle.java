public class Vehicle {

    /****************
     * My solution *
     ***************/
    /*private String type;
    private String locomotionType;
    private boolean hasEngine;
    private int gears;

    public Vehicle(String type, String locomotionType, boolean hasEngine, int gears) {
        this.type = type;
        this.locomotionType = locomotionType;
        this.hasEngine = hasEngine;
        this.gears = gears;
    }

    public void move() {
        System.out.println("Vehicle needs to move");
    }

    public void stop() {
        System.out.println("Vehicle needs to stop");
    }

    public String getType() {
        return type;
    }

    public String getLocomotionType() {
        return locomotionType;
    }

    public boolean getHasEngine() {
        return hasEngine;
    }

    public int getGears() {
        return gears;
    }*/

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        this.currentVelocity = 0;
    }
}
