package org.example.garment_simulator;

public class CasualGarmentFactory implements Garments{
    @Override
    public Top createTop() {
        return new CasualTop();
    }
    @Override
    public Pant createPant() {
        return new CasualPant();
    }
    @Override
    public Shoe createShoe() {
        return new CasualShoe();
    }
}
