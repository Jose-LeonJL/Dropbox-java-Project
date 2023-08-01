package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdministradorApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Administrador-View.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        primaryStage.setTitle("Administrador");
        //primaryStage.setMinHeight(650);
        //primaryStage.setMinWidth(450);
        //primaryStage.setMaxHeight(650);
        //primaryStage.setMaxWidth(450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
