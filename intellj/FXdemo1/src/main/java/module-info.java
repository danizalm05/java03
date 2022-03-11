module com.example.fxdemo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxdemo1 to javafx.fxml;
    exports com.example.fxdemo1;
}