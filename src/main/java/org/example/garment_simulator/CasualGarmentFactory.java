package org.example.garment_simulator;
/**
 * Factory class to create casual garments.
 * Implements the Garments interface to ensure consistency across different garment factories.
 */
public class CasualGarmentFactory implements Garments{
    /**
     * Creates a new CasualTop object.
     * @return a new instance of CasualTop
     */
    @Override
    public Top createTop() {
        return new CasualTop();
    }
    /**
     * Creates a new CasualPant object.
     * @return a new instance of CasualPant
     */
    @Override
    public Pant createPant() {
        return new CasualPant();
    }
    /**
     * Creates a new CasualShoe object.
     * @return a new instance of CasualShoe
     */
    @Override
    public Shoe createShoe() {
        return new CasualShoe();
    }
}
