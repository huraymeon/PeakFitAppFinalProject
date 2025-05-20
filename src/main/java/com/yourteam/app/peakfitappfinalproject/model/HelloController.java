package com.yourteam.app.peakfitappfinalproject.model;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeLabel;

    @FXML
    protected void onButtonClick() {
        welcomeLabel.setText("Welcome to PeakFit!");
    }
}
