package com.yourteam.app.peakfitappfinalproject.model;
import java.util.ArrayList;
import java.util.List;


public class Workout {
    private static final List<Exercise> excercises;
    private String date;
    private double hoursWorked;

    public Workout(){
        excercises = new ArrayList<>();
    }


    public void addExcercise(Exercise e){
        if(e==null){
            throw new IllegalArgumentException();
        }
        excercises.add(e);
    }

    public void setDate(String s){
        this.date = s;
    }
    public void setHoursWorked(double d){
        this.hoursWorked = d;
    }

    public String getDate(){
        return date;
    }
    public double getHoursWorked(){
        return hoursWorked;
    }

    @Override
    public String toString(){
        String returnString = "Workout on " + date + ", duration " + hoursWorked + " hours.\n" + excercises.size() + " excercises were completed:\n";
        for(int i = 0;i< excercises.size();i++){
            returnString+= excercises.get(i).toString() + "\n";
        return returnString;
    }
}




}
