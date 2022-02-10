module com.example.hello01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hello01 to javafx.fxml;
    exports com.example.hello01;
}