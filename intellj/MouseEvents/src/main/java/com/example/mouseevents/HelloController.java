package com.example.mouseevents;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.util.Locale;

public class HelloController {
    @FXML
    private Button button01;
    @FXML
    private ColorPicker color;

    @FXML
    private Label welcomeText;

    @FXML
    void Hide(MouseEvent event) {
        Color  col = color.getValue();
        button01.setTextFill(col);
        System.out.println(col);
        welcomeText.setVisible(false);

    }

    @FXML
    void onHelloButtonClick(ActionEvent event) {

        System.out.println("onHelloButtonClick");
    }

    @FXML
    void Enter(MouseEvent event) {
        System.out.println("Enter");
        String str = welcomeText.getId().toLowerCase(Locale.ROOT);
        System.out.println(str);
        welcomeText.setVisible(true);
    }
}
