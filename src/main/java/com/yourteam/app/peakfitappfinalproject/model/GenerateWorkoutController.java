package com.yourteam.app.peakfitappfinalproject.model;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.Node;

import java.io.IOException;

public class GenerateWorkoutController {

    @FXML
    private ComboBox<String> muscleGroupCombo;

    @FXML
    private TextArea workoutArea;

    @FXML
    public void initialize() {
        muscleGroupCombo.getItems().addAll("Chest", "Back", "Legs", "Arms", "Shoulders", "Full Body");
    }

    @FXML
    private void handleGenerateWorkout(ActionEvent event) {
        String muscle = muscleGroupCombo.getValue();
        if (muscle == null) {
            workoutArea.setText("Please select a muscle group.");
            return;
        }

        String result = switch (muscle.toLowerCase()) {
            case "chest" -> "Bench Press\nPush-ups\nIncline Dumbbell Press";
            case "back" -> "Deadlifts\nPull-ups\nSeated Cable Rows";
            case "legs" -> "Squats\nLunges\nLeg Press";
            case "arms" -> "Barbell Curls\nTricep Dips\nHammer Curls";
            case "shoulders" -> "Overhead Press\nLateral Raises\nFront Raises";
            case "full body" -> "Burpees\nKettlebell Swings\nJump Squats";
            default -> "No workout found.";
        };

        workoutArea.setText("Workout for " + muscle + ":\n\n" + result);
    }

    @FXML
    private void handleBackToMain(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/yourteam/app/peakfitappfinalproject/model/main-dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("PeakFit App");
        stage.show();
    }
}
