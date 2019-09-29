public class Main {

    public static void main(String[] args) {

        StorageFurniture sinkCabinet = new StorageFurniture("Sink Cabinet","bathroom", true,true,1,100,50,25);
        sinkCabinet.open(1);
        sinkCabinet.open("Left");
        sinkCabinet.close();

        StorageFurniture closet = new StorageFurniture("Liquids closet","bathroom", false, true,0,100,50, 25);
        Solids sink = new Solids("sink", "bathroom",10);
        Room bathroom = new Room("bathroom",closet,sink, sinkCabinet);

        bathroom.openStorage(closet,"left");


    }

}
