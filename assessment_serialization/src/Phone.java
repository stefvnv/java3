/**
 * Assignment 2 - Serialization
 * Part 1 - Phone
 * Stefana Chiritescu
 * A00282343
 */

import java.io.Serializable;

public class Phone implements Serializable {
    private final String make;
    private final String model;
    private final int memory;
    private final double camera;
    private final double screenSize;
    private final boolean smart;
    private final int price;


    public Phone(String make, String model, int memory, double camera, double screenSize, boolean smart, int price) {
        this.make = make;
        this.model = model;
        this.memory = memory;
        this.camera = camera;
        this.screenSize = screenSize;
        this.smart = smart;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Make: '" + make + '\'' +
                ", Model: '" + model + '\'' +
                ", Memory: " + memory + "GB" +
                ", Camera: " + camera + "MP" +
                ", Screen size: " + screenSize + "in" +
                ", Smart phone: " + (smart ? "Yes" : "No") +
                ", Price: €" + price;
    }
}
