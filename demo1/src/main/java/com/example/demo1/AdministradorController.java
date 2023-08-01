package com.example.demo1;

import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.io.IOException;

public class AdministradorController {
    @FXML
    protected void OnLoginButtonClick() throws IOException {
        AdministradorApp administradorApp = new AdministradorApp();
        administradorApp.start(new Stage());
    }
}
