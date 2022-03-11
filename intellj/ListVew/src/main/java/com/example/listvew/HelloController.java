package com.example.listvew;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    //private ListView<?> listOfNames;
    private ListView<String> listOfNames;
    @FXML
    private TextField name;

    @FXML
    private Label welcomeText;

    @FXML
    void addName(MouseEvent event) {
        String inStr = name.getText();
        System.out.println(inStr);
        listOfNames.getItems().add(inStr);

    }






    @FXML
    void onHelloButtonClick(ActionEvent event) {

    }

    @FXML
    void removeName(MouseEvent event) {
     int selectedID = listOfNames.getSelectionModel().getSelectedIndex();
        listOfNames.getItems().remove(selectedID);
    }

}
