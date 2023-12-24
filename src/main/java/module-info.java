module com.example.se302 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;
    requires java.desktop;
    requires com.google.gson;


    opens com.example.se302 to javafx.fxml, com.google.gson;

    exports com.example.se302;
}