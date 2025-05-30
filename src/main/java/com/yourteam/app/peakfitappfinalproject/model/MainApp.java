package com.yourteam.app.peakfitappfinalproject.model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/yourteam/app/peakfitappfinalproject/model/login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("PeakFit App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
