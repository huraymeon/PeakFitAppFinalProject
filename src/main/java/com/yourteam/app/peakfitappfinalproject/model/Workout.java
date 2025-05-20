package com.yourteam.app.peakfitappfinalproject.model;
import java.util.ArrayList;
import java.util.List;


public class Workout {
    private List<Exercise> exercises = new ArrayList<>();
    private String date;
    private double hoursWorked;

    public Workout() {
        exercises = new ArrayList<>();
    }


    public void addExcercise(Exercise e) {
        if (e == null) {
            throw new IllegalArgumentException();
        }
        exercises.add(e);
    }

    public void setDate(String s) {
        this.date = s;
    }

    public void setHoursWorked(double d) {
        this.hoursWorked = d;
    }

    public String getDate() {
        return date;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public int getTotal(){
        return exercises.size();
    }

    @Override
    public String toString() {
        String returnString = "Workout on " + date + ", duration " + hoursWorked + " hours.\n" + exercises.size() + " excercises were completed:\n";
        for (int i = 0; i < exercises.size(); i++) {
            returnString += exercises.get(i).toString() + "\n";
        }
            return returnString;
        }
    }



