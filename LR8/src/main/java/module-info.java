module com.example.lr8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lr8 to javafx.fxml;
    exports com.example.lr8;
}