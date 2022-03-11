package com.example.fxdemo1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class FXController implements Initializable {

    @FXML
    private Spinner<Integer> spinner;
    SpinnerValueFactory<Integer> svf =
          new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10,1);
    @FXML
    private Text text;

    @FXML
    private Label welcomeText;

    @FXML
    void getText(MouseEvent event) {
       int number = spinner.getValue();
       text.setText(String.valueOf(number));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        spinner.setValueFactory(svf);
    }
}
