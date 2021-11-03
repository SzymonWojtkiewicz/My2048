module My2048 {
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.controls;

    exports My2048fx to javafx.graphics;
    opens My2048fx to javafx.fxml;
}