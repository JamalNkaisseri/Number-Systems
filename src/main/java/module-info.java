module com.example.numbersystems {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.numbersystems to javafx.fxml;
    exports com.example.numbersystems;
}