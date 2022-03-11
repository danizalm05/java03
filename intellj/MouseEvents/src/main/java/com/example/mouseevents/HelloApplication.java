//11: Mouse Events
//https://www.youtube.com/watch?v=Y-qhvl6tbgk&list=PLrzWQu7Ajpi26jZvP8JhEJgFPFEj_fojO&index=15
//15: ColorPicker
//https://www.youtube.com/watch?v=9pdwhF_dX2o&list=PLrzWQu7Ajpi26jZvP8JhEJgFPFEj_fojO&index=18
package com.example.mouseevents;

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
        stage.setTitle("Mouse Events");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}