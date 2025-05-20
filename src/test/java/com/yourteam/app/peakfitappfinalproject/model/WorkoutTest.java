package com.yourteam.app.peakfitappfinalproject.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkoutTest {

    @Test
    void testGetTotal(){
        Workout w1 = new Workout();//Create and initialize Workout object
        w1.setDate("5/20/2025");
        w1.setHoursWorked(1.5);

        Exercise e1 = new Exercise("Pull-Ups","Back",2,10);//Create and initialize exercise objects
        Exercise e2 = new Exercise("Preacher Curls","Biceps",2,12);
        Exercise e3 = new Exercise("T-Bar Rows","Back",3,8);

        w1.addExcercise(e1);//Add exercises to workout
        w1.addExcercise(e2);
        w1.addExcercise(e3);

        int getTotal = w1.getTotal();
        assertEquals(3,getTotal);

    }

    @Test
    void testToString() {
        Workout w1 = new Workout();//Create and initialize Workout object
        w1.setDate("5/20/2025");
        w1.setHoursWorked(1.5);

        Exercise e1 = new Exercise("Pull-Ups","Back",2,10);//Create and initialize exercise objects
        Exercise e2 = new Exercise("Preacher Curls","Biceps",2,12);
        Exercise e3 = new Exercise("T-Bar Rows","Back",3,8);

        w1.addExcercise(e1);//Add exercises to workout
        w1.addExcercise(e2);
        w1.addExcercise(e3);

        String expectedToString = "Workout on 5/20/2025, duration 1.5 hours.\n3 excercises were completed:\n"+e1.toString()+"\n"+e2.toString()+"\n"
                +e3.toString()+"\n";
        String actualString = w1.toString();
        assertEquals(expectedToString,actualString);
    }
}