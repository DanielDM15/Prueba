module mx.uaemex.fi.pruebas.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens mx.uaemex.fi.pruebas.demo to javafx.fxml;
    exports mx.uaemex.fi.pruebas.demo;
}