package com.yourteam.app.peakfitappfinalproject.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkoutHistoryController {
    private static List<Workout> workoutLog = new ArrayList<>();

    @FXML
    private TextArea logArea;




    public static void logWorkout(Workout workout){
        workoutLog.add(workout);
    }


    @FXML
    private void handleBackToMain(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/yourteam/app/peakfitappfinalproject/model/main-dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("PeakFit App");
        stage.show();
    }

    @FXML
    protected void loadLog(){
        String log = "";
        for(int i = 0;i<workoutLog.size();i++){
            log += workoutLog.get(i).toString();
        }
        logArea.setText(log);
    }
}
