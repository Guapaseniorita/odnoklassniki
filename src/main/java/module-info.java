module com.example.odnoklassniki {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.odnoklassniki to javafx.fxml;
    exports com.example.odnoklassniki;
}