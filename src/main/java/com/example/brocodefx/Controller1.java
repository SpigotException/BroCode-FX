package com.example.brocodefx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller1 {
@FXML
    TextField UserName;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void Login(ActionEvent event) throws IOException {

        String userName = UserName.getText();
       FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
       root = loader.load();

       Controler2 scene2Controler = loader.getController();
       scene2Controler.displayName(userName);


      //  Parent root =
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}