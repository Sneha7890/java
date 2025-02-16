package com.wipro.java.designpattern.builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        // Building a house with a garage and swimming pool
        House luxuryHouse = new House.HouseBuilder("Concrete", "Brick", "Tiles")
                .setGarage(true)
                .setSwimmingPool(true)
                .setGarden(true)
                .build();

        luxuryHouse.showHouseDetails();

        // Building a simple house without additional features
        House simpleHouse = new House.HouseBuilder("Wood", "Cement", "Metal")
                .build();

        simpleHouse.showHouseDetails();
    }
}
