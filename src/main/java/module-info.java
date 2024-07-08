module org.example.garment_simulator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.garment_simulator to javafx.fxml;
    exports org.example.garment_simulator;
}