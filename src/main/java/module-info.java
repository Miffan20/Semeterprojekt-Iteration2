module com.example.iteration2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.iteration2 to javafx.fxml;
    exports com.example.iteration2;
}