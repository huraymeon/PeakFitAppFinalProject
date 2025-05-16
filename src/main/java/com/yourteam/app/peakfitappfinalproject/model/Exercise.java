package com.yourteam.app.peakfitappfinalproject.model;

public class Exercise {
    private final String name;
    private final String muscleGroup;
    private final int sets;
    private final int reps;

    public Exercise(String name, String muscleGroup, int sets, int reps) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Exercise name required");
        }
        if (muscleGroup == null || muscleGroup.isBlank()){
            throw new IllegalArgumentException("Muscle Group required");
        }
        if (sets <= 0 || reps <= 0) {
            throw new IllegalArgumentException("Sets and reps must be positive");
        }
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.sets = sets;
        this.reps = reps;
    }
    public String getName() {
        return name;
    }
    public String getMuscleGroup(){
        return muscleGroup;
    }
    public int getSets() {
        return sets;
    }
    public int getReps() {
        return reps;
    }
    @Override
    public String toString(){
        return String.format("%s (%s): %dx%d", name, muscleGroup, sets, reps);
    }
}
