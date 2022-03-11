module com.example.mouseevents {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mouseevents to javafx.fxml;
    exports com.example.mouseevents;
}