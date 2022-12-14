module com.example.pruebacustom3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pruebacustom3 to javafx.fxml;
    exports com.example.pruebacustom3;
}