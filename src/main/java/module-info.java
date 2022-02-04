module com.example.valorantskins {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.valorantskins to javafx.fxml;
    exports com.example.valorantskins;
}