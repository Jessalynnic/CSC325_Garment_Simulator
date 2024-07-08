package org.example.garment_simulator;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SimulatorController {
    @FXML
    private ImageView professionalTopView;
    @FXML
    private ImageView professionalPantView;
    @FXML
    private ImageView professionalShoeView;

    @FXML
    private ImageView casualTopView;
    @FXML
    private ImageView casualPantView;
    @FXML
    private ImageView casualShoeView;

    @FXML
    private ImageView partyTopView;
    @FXML
    private ImageView partyPantView;
    @FXML
    private ImageView partyShoeView;

    @FXML
    private void displayProfessionalGarments() {
        loadImages(professionalTopView, professionalPantView, professionalShoeView, "/images/Professional_Top.png", "/images/Professional_Pants.png", "/images/Professional_Shoes.png");

        Garments factory = new ProfessionalGarmentFactory();
        Top top = factory.createTop();
        Pant pant = factory.createPant();
        Shoe shoe = factory.createShoe();

        top.display();
        pant.display();
        shoe.display();
    }

    @FXML
    private void displayCasualGarments() {
        loadImages(casualTopView, casualPantView, casualShoeView, "/images/Casual_Top.png", "/images/Casual_Pants.png", "/images/Casual_Shoes.png");

        Garments factory = new CasualGarmentFactory();
        Top top = factory.createTop();
        Pant pant = factory.createPant();
        Shoe shoe = factory.createShoe();

        top.display();
        pant.display();
        shoe.display();
    }

    @FXML
    private void displayPartyGarments() {
        loadImages(partyTopView, partyPantView, partyShoeView, "/images/Party_Top.png", "/images/Party_Pants.png", "/images/Party_Shoes.png");

        Garments factory = new PartyGarmentFactory();
        Top top = factory.createTop();
        Pant pant = factory.createPant();
        Shoe shoe = factory.createShoe();

        top.display();
        pant.display();
        shoe.display();
    }
    private void loadImages(ImageView topView, ImageView pantView, ImageView shoeView, String topPath, String pantPath, String shoePath) {
        try {
            topView.setImage(new Image(getClass().getResource(topPath).toExternalForm()));
            pantView.setImage(new Image(getClass().getResource(pantPath).toExternalForm()));
            shoeView.setImage(new Image(getClass().getResource(shoePath).toExternalForm()));
        } catch (Exception e) {
            System.out.println("Error loading images: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
