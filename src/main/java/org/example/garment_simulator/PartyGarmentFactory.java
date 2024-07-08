package org.example.garment_simulator;

public class PartyGarmentFactory implements Garments{
    @Override
    public Top createTop() {
        return new PartyTop();
    }
    @Override
    public Pant createPant() {
        return new PartyPant();
    }
    @Override
    public Shoe createShoe() {
        return new PartyShoe();
    }
}
