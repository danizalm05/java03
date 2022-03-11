package com.example.datepicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ChoiceBox<String> animals;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Button getDate;

    @FXML
    void getDate(MouseEvent event) {
        //Click the date picker button
        LocalDate time = datePicker.getValue();
        System.out.println(time);
    }

    @FXML
    void onHelloButtonClick(ActionEvent event) {
      String animal = animals.getSelectionModel().getSelectedItem();
        System.out.println(animal);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        animals.getItems().addAll("dog","cat","camel","donkey");
    }
}
