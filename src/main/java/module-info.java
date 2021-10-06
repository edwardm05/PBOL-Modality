module com.example.fxmodality {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxmodality to javafx.fxml;
    exports com.example.fxmodality;
}