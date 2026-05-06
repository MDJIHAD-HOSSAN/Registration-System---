package com.tigerit.registrationsystem;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @FXML
    public Label welcomeNameLabel;

    @FXML
    public void logoutButtonClicked() {
        HelloApplication.loggedUser = null;
        HelloApplication.changeScene("login");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        welcomeNameLabel.setText(HelloApplication.loggedUser.getName());
    }


}
