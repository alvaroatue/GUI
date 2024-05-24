module GUI {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;

    opens java to javafx.fxml;
    exports application;
    exports controllers;
    exports images;
    exports model;
    exports utilities;
}