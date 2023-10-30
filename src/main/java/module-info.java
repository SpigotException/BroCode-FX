module com.example.brocodefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.brocodefx to javafx.fxml;
    exports com.example.brocodefx;
}