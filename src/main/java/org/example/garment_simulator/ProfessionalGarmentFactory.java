package org.example.garment_simulator;

public class ProfessionalGarmentFactory implements Garments{
    @Override
    public Top createTop() {
        return new ProfessionalTop();
    }
    @Override
    public Pant createPant() {
        return new ProfessionalPant();
    }
    @Override
    public Shoe createShoe() {
        return new ProfessionalShoe();
    }
}
