module com.example.imageshow {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.imageshow to javafx.fxml;
    exports com.example.imageshow;
}