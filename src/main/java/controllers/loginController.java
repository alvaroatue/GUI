package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class loginController {

    @FXML
    private Label lblMensaje;

    @FXML
    void click(ActionEvent event) {
        lblMensaje.setText("hola mundo");
    }

        
}