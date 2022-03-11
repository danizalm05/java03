package com.example.filegui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    FileChooser fileChooser = new FileChooser();



    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private TextArea textArea;



    @FXML
    void getText(MouseEvent event) {
        File file = fileChooser.showOpenDialog(new Stage());
    }

  @Override
   public void initialize(URL url, ResourceBundle resourceBundle) {
     //Inilialize
     //String path =  "C:\\Users\\gilfm\\Documents\\d\\java03\\intellj\\FileGUI\\src";
     String path =".\\";
     fileChooser.setInitialDirectory(new File(path));
    }

}