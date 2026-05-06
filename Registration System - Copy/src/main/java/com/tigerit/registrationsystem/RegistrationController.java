package com.tigerit.registrationsystem;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class RegistrationController {

    @FXML
    public TextField nameTextField;
    @FXML
    public TextField emailTextField;
    @FXML
    public PasswordField passwordField;

    @FXML
    public void saveButtonClickEvent () {
        IO.println("Save button clicked");
        String name = nameTextField.getText();
        IO.println("Name is: " + name);

        String email = emailTextField.getText();
        IO.println("email is :" + email);

        String password = passwordField.getText();
        IO.println("Password is: " + password);

        User user = new User(name, email, password);
        HelloApplication.userList.add(user);

       nameTextField.clear();
       emailTextField.clear();
       passwordField.clear();


    }

    @FXML
    public void signInLabelClicked() {
        IO.println("Sign in Label Clicked");
        HelloApplication.changeScene("login");

    }
}
