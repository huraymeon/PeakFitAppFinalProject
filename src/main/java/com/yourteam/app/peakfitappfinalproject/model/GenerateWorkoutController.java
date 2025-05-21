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
import java.util.*;

public class GenerateWorkoutController {

    @FXML
    private ComboBox<String> goalCombo;

    @FXML
    private ComboBox<String> muscleGroupCombo;

    @FXML
    private TextArea workoutArea;

    private final Random random = new Random();

    private final Map<String, List<String>> workouts = Map.of(
            "chest", List.of("Bench Press", "Push-ups", "Incline Dumbbell Press", "Cable Flyes"),
            "back", List.of("Deadlifts", "Pull-ups", "Seated Cable Rows", "Lat Pulldown"),
            "legs", List.of("Squats", "Lunges", "Leg Press", "Leg Curls"),
            "arms", List.of("Barbell Curls", "Tricep Dips", "Hammer Curls", "Skull Crushers"),
            "shoulders", List.of("Overhead Press", "Lateral Raises", "Front Raises", "Arnold Press"),
            "full body", List.of("Burpees", "Kettlebell Swings", "Jump Squats", "Mountain Climbers")
    );

    @FXML
    public void initialize() {
        muscleGroupCombo.getItems().addAll("Chest", "Back", "Legs", "Arms", "Shoulders", "Full Body");
        goalCombo.getItems().addAll("Fat Loss", "Strength", "Hypertrophy");
    }

    @FXML
    private void handleGenerateWorkout(ActionEvent event) {
        String muscle = muscleGroupCombo.getValue();
        String goal = goalCombo.getValue();

        if (muscle == null || goal == null) {
            workoutArea.setText("Please select both a muscle group and a goal.");
            return;
        }

        List<String> exercises = new ArrayList<>(workouts.get(muscle.toLowerCase()));
        Collections.shuffle(exercises);

        StringBuilder sb = new StringBuilder();
        sb.append("Workout for ").append(muscle).append(" (Goal: ").append(goal).append(")\n\n");

        for (int i = 0; i < 3 && i < exercises.size(); i++) {
            String setsReps = switch (goal.toLowerCase()) {
                case "fat loss" -> "3 sets x 15 reps";
                case "strength" -> "5 sets x 5 reps";
                case "hypertrophy" -> "4 sets x 10 reps";
                default -> "3 sets x 10 reps";
            };
            sb.append(exercises.get(i)).append(" - ").append(setsReps).append("\n");
        }

        workoutArea.setText(sb.toString());
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
