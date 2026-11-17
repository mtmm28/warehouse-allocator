package com.portafolio.inventory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class WarehouseTest {

    @Test
    void itemSmallerThanCapacityFits() {
        Warehouse warehouse = new Warehouse("W1", 10);
        Item item = new Item("PART-001", 5);

        assertTrue(warehouse.canFit(item));
    }
}
