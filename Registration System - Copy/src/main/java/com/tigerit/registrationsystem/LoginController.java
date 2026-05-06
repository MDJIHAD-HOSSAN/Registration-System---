package com.tigerit.registrationsystem;

import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.util.Duration;

public class LoginController {

    @FXML
    public TextField emailTextField;

    @FXML
    public PasswordField passwordField;


    @FXML
    public void loginButtonClicked () {
        String email = emailTextField.getText();
        String password = passwordField.getText();

        IO.println("Email is : " + email);
        IO.println("Password is : " + password);

        for (User user : HelloApplication.userList) {
            if (user.getEmail().equals(email)
                && user.getPassword().equals(password)) {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Login");
                alert.setContentText("Login Successful");
                alert.show();

                PauseTransition delay = new PauseTransition(Duration.seconds(2));
                delay.setOnFinished(e -> alert.close());
                delay.play();

                HelloApplication.loggedUser = user;
                HelloApplication.changeScene("dashboard");
                return;
            }
        }

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setContentText("Wrong email or password");
        alert.showAndWait();
    }

    @FXML
    public void registerLabelClicked () {
        IO.println("Register Label Clicked");
        HelloApplication.changeScene("registration");
    }


}
