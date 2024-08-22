module ui {

    requires CoutureRental.core;
    requires CoutureRental.persistence;


    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.core;
    requires java.net.http;


    opens ui to javafx.graphics, javafx.fxml;
}

