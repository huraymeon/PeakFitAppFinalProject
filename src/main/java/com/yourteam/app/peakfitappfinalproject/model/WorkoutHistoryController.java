package com.yourteam.app.peakfitappfinalproject.model;

import java.util.ArrayList;
import java.util.List;

public class WorkoutHistoryController {
    private List<Workout> workoutLog = new ArrayList<>();


    public void logWorkout(Workout workout){
        workoutLog.add(workout);
    }
}
