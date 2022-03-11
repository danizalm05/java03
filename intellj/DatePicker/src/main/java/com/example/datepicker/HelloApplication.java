/*
13: DatePicker
 https://www.youtube.com/watch?v=dtpDzWICN4g&list=PLrzWQu7Ajpi26jZvP8JhEJgFPFEj_fojO&index=16
14: ChoiceBox
https://www.youtube.com/watch?v=CAXmTJIrj0k&list=PLrzWQu7Ajpi26jZvP8JhEJgFPFEj_fojO&index=17
*/


package com.example.datepicker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Date Picker");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}