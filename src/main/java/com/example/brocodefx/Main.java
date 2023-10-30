package com.example.brocodefx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    //1.44 video

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        String css = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(css);

        Image icon = new Image("file:///D:/Dokumente/Informatik/Eigene%20Projekte/BroCodeFX/src/pepe.jpeg");

        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}