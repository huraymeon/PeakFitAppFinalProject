package com.yourteam.app.peakfitappfinalproject.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LogWorkoutController {

    @FXML
    private TextField dateField;
    @FXML
    private TextField durationField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField muscleField;
    @FXML
    private TextField setsField;
    @FXML
    private TextField repsField;

    Workout workout = new Workout();

    @FXML
    protected void setDate(){
        String date = dateField.getText();
        workout.setDate(date);
    }

    @FXML
    protected void setDuration(){
        String duration = durationField.getText();
        workout.setDate(duration);
    }

    @FXML
    protected void addExercise(){
        String name = nameField.getText();
        String muscle = muscleField.getText();
        int reps = Integer.parseInt(repsField.getText());
        int sets = Integer.parseInt(setsField.getText());
        workout.addExcercise(new Exercise(name,muscle,reps,sets));
    }

    @FXML
    private void finishLog(ActionEvent event) throws IOException {
        //Add workout to log



        //return to main menu
        Parent root = FXMLLoader.load(getClass().getResource("/com/yourteam/app/peakfitappfinalproject/model/main-dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("PeakFit App");
        stage.show();
    }
    //
}
