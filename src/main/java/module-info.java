module com.example.se302 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;


    opens com.example.se302 to javafx.fxml;
    exports com.example.se302;
}