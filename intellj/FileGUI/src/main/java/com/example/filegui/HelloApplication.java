//16: FileChooser: loading files
//https://www.youtube.com/watch?v=fvf1WOPqLBw&list=PLrzWQu7Ajpi26jZvP8JhEJgFPFEj_fojO&index=19
//17: FileChooser: saving files
//https://www.youtube.com/watch?v=ZGFjaZLwqns&list=PLrzWQu7Ajpi26jZvP8JhEJgFPFEj_fojO&index=20
//Source code
//https://gist.github.com/Da9el00/f75565592ded943420969a3fbcad4d2a





package com.example.filegui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
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
        {
            File file = new File(".\\text.txt");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            launch(args);
        }
   }//main
}