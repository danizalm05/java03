// #7: Add and remove items from ListView
//C:\Users\gilfm\Documents\d\java03\intellj\ListVew
//https://www.youtube.com/watch?v=TDyIRhqdNqs&list=PLrzWQu7Ajpi26jZvP8JhEJgFPFEj_fojO&index=11
package com.example.listvew;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load()  );
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}