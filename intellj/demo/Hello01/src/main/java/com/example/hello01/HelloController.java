package com.example.hello01;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private BorderPane image;
    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Welcome to JavaFX Application!");
       System.out.println("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onHelloButtonClick02() {
        image.setVisible(true);
        welcomeText.setText("Welcome to JavaFX Image!");
        System.out.println("Welcome to JavaFX Image!");

    }
    @FXML
    void onMouseExited(MouseEvent event) {

        welcomeText.setText("Welcome to JavaFX MouseEvent event!");

    }

}