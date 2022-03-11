module com.example.listvew {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.listvew to javafx.fxml;
    exports com.example.listvew;
}