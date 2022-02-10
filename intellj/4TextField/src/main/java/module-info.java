module com.itom.textfield {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.itom.textfield to javafx.fxml;
    exports com.itom.textfield;
}