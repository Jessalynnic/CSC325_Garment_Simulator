package org.example.garment_simulator;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Controller class for the garment simulator.
 */
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

    /**
     * Displays professional garments when the Professional Garments button is pressed.
     */
    @FXML
    private void displayProfessionalGarments() {
        loadImages(professionalTopView, professionalPantView, professionalShoeView, "/images/Professional_Top.png", "/images/Professional_Pants.png", "/images/Professional_Shoes.png");

        // Using factory to create professional garments
        Garments factory = new ProfessionalGarmentFactory();
        Top top = factory.createTop();
        Pant pant = factory.createPant();
        Shoe shoe = factory.createShoe();

        // Displaying details of professional garments
        top.display();
        pant.display();
        shoe.display();
    }

    /**
     * Displays casual garments when the Casual Garments button is pressed.
     */
    @FXML
    private void displayCasualGarments() {
        loadImages(casualTopView, casualPantView, casualShoeView, "/images/Casual_Top.png", "/images/Casual_Pants.png", "/images/Casual_Shoes.png");

        // Using factory to create casual garments
        Garments factory = new CasualGarmentFactory();
        Top top = factory.createTop();
        Pant pant = factory.createPant();
        Shoe shoe = factory.createShoe();

        // Displaying details of casual garments
        top.display();
        pant.display();
        shoe.display();
    }

    /**
     * Displays party garments when the Party Garments button is pressed.
     */
    @FXML
    private void displayPartyGarments() {
        loadImages(partyTopView, partyPantView, partyShoeView, "/images/Party_Top.png", "/images/Party_Pants.png", "/images/Party_Shoes.png");

        // Using factory to create party garments
        Garments factory = new PartyGarmentFactory();
        Top top = factory.createTop();
        Pant pant = factory.createPant();
        Shoe shoe = factory.createShoe();

        // Displaying details of party garments
        top.display();
        pant.display();
        shoe.display();
    }

    /**
     * Loads images
     */
    private void loadImages(ImageView topView, ImageView pantView, ImageView shoeView, String topPath, String pantPath, String shoePath) {
        try {
            // Loading and setting images to respective ImageViews
            topView.setImage(new Image(getClass().getResource(topPath).toExternalForm()));
            pantView.setImage(new Image(getClass().getResource(pantPath).toExternalForm()));
            shoeView.setImage(new Image(getClass().getResource(shoePath).toExternalForm()));
        } catch (Exception e) {
            // Handling exceptions related to image loading
            System.out.println("Error loading images: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
