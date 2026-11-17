package com.portafolio.inventory;

public class Warehouse {
    private final String id;
    private final int capacity;

    public Warehouse(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean canFit(Item item) {
        return item.volume() <= capacity; //first test
    }
}