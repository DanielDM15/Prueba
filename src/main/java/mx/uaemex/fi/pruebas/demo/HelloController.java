package mx.uaemex.fi.pruebas.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML private ImageView chiva;

    @FXML
    protected void onHelloButtonClick() {

        chiva.setVisible(true);
        welcomeText.setText("Arriba las chivas---");
    }
}
