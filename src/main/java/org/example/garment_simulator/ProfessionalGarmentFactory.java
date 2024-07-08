package org.example.garment_simulator;
/**
 * Factory class to create professional garments.
 * Implements the Garments interface to ensure consistency across different garment factories.
 */

public class ProfessionalGarmentFactory implements Garments{
    /**
     * Creates a new ProfessionalTop object.
     * @return a new instance of ProfessionalTop
     */
    @Override
    public Top createTop() {
        return new ProfessionalTop();
    }
    /**
     * Creates a new ProfessionalPant object.
     * @return a new instance of ProfessionalPant
     */
    @Override
    public Pant createPant() {
        return new ProfessionalPant();
    }
    /**
     * Creates a new ProfessionalShoe object.
     * @return a new instance of ProfessionalShoe
     */
    @Override
    public Shoe createShoe() {
        return new ProfessionalShoe();
    }
}
