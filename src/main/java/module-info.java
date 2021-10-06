module com.example.fxmodality {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxmodality to javafx.fxml;
    exports com.example.fxmodality;
    exports com.example.fxmodality.Controller;
    opens com.example.fxmodality.Controller to javafx.fxml;
}