package com.busurca.room;

public class Room {

    private String name;
    private StorageFurniture storageFurniture;
    private Solids solids;
    private StorageFurniture sinkCabinet;

    public Room(String name, StorageFurniture storageFurniture, Solids solids, StorageFurniture sinkCabinet) {
        this.name = name;
        this.storageFurniture = storageFurniture;
        this.solids = solids;
        this.sinkCabinet = sinkCabinet;
    }

    public void openStorage(StorageFurniture storageFurniture, int drawerNo){
        storageFurniture.open(drawerNo);
    }

    public void openStorage(StorageFurniture storageFurniture, String door){
        storageFurniture.open(door);
    }
}
