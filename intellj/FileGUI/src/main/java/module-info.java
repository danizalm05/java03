module com.example.filegui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.filegui to javafx.fxml;
    exports com.example.filegui;
}