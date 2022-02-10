//https://www.youtube.com/watch?v=3usWJa3IDiE&list=PLrzWQu7Ajpi26jZvP8JhEJgFPFEj_fojO&index=6
//2:image view
//www.youtube.com/watch?v=PnvdRKkoDgU&list=PLrzWQu7Ajpi26jZvP8JhEJgFPFEj_fojO&index=7
package com.example.hello01;

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
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}