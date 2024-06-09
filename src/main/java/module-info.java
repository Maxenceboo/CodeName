module fr.maxence {
    requires javafx.controls;
    requires javafx.fxml;

    opens fr.maxence to javafx.fxml;
    exports fr.maxence;
}
