package org.example.garment_simulator;
/**
 * Interface representing a factory for creating different types of garments.
 */
public interface Garments {
    /**
     * Creates a Top object.
     * @return a Top object.
     */
    Top createTop();

    /**
     * Creates a Pant object.
     * @return a Pant object.
     */
    Pant createPant();

    /**
     * Creates a Shoe object.
     * @return a Shoe object.
     */
    Shoe createShoe();
}
