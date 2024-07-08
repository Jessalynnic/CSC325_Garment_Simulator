package org.example.garment_simulator;
/**
 * Factory class to create party garments.
 * Implements the Garments interface to ensure consistency across different garment factories.
 */
public class PartyGarmentFactory implements Garments{

    /**
     * Creates a new PartyTop object.
     * @return a new instance of PartyTop
     */
    @Override
    public Top createTop() {
        return new PartyTop();
    }

    /**
     * Creates a new PartyPant object.
     * @return a new instance of PartyPant
     */
    @Override
    public Pant createPant() {
        return new PartyPant();
    }

    /**
     * Creates a new PartyShoe object.
     * @return a new instance of PartyShoe
     */
    @Override
    public Shoe createShoe() {
        return new PartyShoe();
    }
}
