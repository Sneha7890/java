package com.wipro.java.designpattern.builder;

public class House {
    private String foundation;
    private String walls;
    private String roof;
    private boolean garage;
    private boolean swimmingPool;
    private boolean garden;

    // Private constructor to prevent direct instantiation
    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.garage = builder.garage;
        this.swimmingPool = builder.swimmingPool;
        this.garden = builder.garden;
    }

    public void showHouseDetails() {
        System.out.println("House built with " + foundation + " foundation, " + walls + " walls, " + roof + " roof.");
        System.out.println("Garage: " + garage + ", Swimming Pool: " + swimmingPool + ", Garden: " + garden);
    }

    // Static inner Builder class
    public static class HouseBuilder {
        private String foundation;
        private String walls;
        private String roof;
        private boolean garage;
        private boolean swimmingPool;
        private boolean garden;

        // Constructor for mandatory fields
        public HouseBuilder(String foundation, String walls, String roof) {
            this.foundation = foundation;
            this.walls = walls;
            this.roof = roof;
        }

        // Methods for optional fields
        public HouseBuilder setGarage(boolean garage) {
            this.garage = garage;
            return this;
        }

        public HouseBuilder setSwimmingPool(boolean swimmingPool) {
            this.swimmingPool = swimmingPool;
            return this;
        }

        public HouseBuilder setGarden(boolean garden) {
            this.garden = garden;
            return this;
        }

        // Method to build the final House object
        public House build() {
            return new House(this);
        }
    }
}
