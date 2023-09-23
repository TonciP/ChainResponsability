module com.example.chainresponsability {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chainresponsability to javafx.fxml;
    exports com.example.chainresponsability;
}