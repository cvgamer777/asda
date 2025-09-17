module com.example.cigany {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cigany to javafx.fxml;
    exports com.example.cigany;
}