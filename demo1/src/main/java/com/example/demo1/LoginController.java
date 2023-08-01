package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private Button myButton;

    @FXML
    protected void onHelloButtonClick() {
    }

    public void OnLoginButtonClick(ActionEvent event) throws IOException {
        Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        AdministradorApp administradorApp = new AdministradorApp();
        administradorApp.start(new Stage());
        currentStage.close();

    }
}
