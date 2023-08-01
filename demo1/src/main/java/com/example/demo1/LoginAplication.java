package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginAplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login-View.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Button BtnLogin = (Button) scene.lookup("#btnSignin");

        BtnLogin.setOnAction(e -> {
            AdministradorApp mainView = new AdministradorApp();
            try {
                mainView.start(new Stage());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            // Cerrar la vista de inicio de sesión después de abrir la vista principal (opcional)
            primaryStage.close();
        });
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
