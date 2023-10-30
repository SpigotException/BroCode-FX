package com.example.brocodefx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controler2 {
    @FXML
    Label labelName;

    @FXML
    private  Button logoutButton;

    @FXML
    private AnchorPane background;

     Stage stage;
    ImageView imageView;




    public void logout(ActionEvent event){

      Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
      alert.setTitle("Logout");
      alert.setHeaderText("You´re about to logout");
      alert.setContentText("are you shure");

      if (alert.showAndWait().get() == ButtonType.OK){
        stage = (Stage) background.getScene().getWindow();
        stage.close();
    }

    }



    public void displayName(String userName){
        labelName.setText(userName);
    }
}
