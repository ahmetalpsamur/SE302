module com.example.se302 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.se302 to javafx.fxml;
    exports com.example.se302;
}