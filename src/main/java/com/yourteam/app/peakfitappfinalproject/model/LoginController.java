package com.yourteam.app.peakfitappfinalproject.model;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorLabel;

    @FXML
    private void handleLogin(ActionEvent event) {
        String email = emailField.getText();
        String password = passwordField.getText();

        if (email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$") && password.length() >= 4) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/com/yourteam/app/peakfitappfinalproject/model/main-dashboard.fxml"));
                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.setTitle("PeakFit App");
                stage.show();
            } catch (Exception e) {
                errorLabel.setText("Failed to load main screen.");
                e.printStackTrace();
            }
        } else {
            errorLabel.setText("Invalid email or password.");
        }
    }
}
