package com.yourteam.app.peakfitappfinalproject.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {

    // Test for valid exercise creation
    @Test
    void validExerciseCreation() {
        Exercise e = new Exercise("Push-Ups", "Chest", 3, 15);
        assertEquals("Push-Ups", e.getName());
        assertEquals("Chest", e.getMuscleGroup());
        assertEquals(3, e.getSets());
        assertEquals(15, e.getReps());
    }

    // Test for invalid exercise name (blank)
    @Test
    void invalidNameThrows() {
        assertThrows(IllegalArgumentException.class, () -> new Exercise("", "Chest", 3, 15));
        assertThrows(IllegalArgumentException.class, () -> new Exercise(null, "Chest", 3, 15));
    }

    // Test for invalid muscle group (blank)
    @Test
    void invalidMuscleGroupThrows() {
        assertThrows(IllegalArgumentException.class, () -> new Exercise("Push-Ups", "", 3, 15));
        assertThrows(IllegalArgumentException.class, () -> new Exercise("Push-Ups", null, 3, 15));
    }

    // Test for invalid sets or reps (non-positive values)
    @Test
    void invalidSetsOrRepsThrows() {
        assertThrows(IllegalArgumentException.class, () -> new Exercise("Push-Ups", "Chest", 0, 15)); // sets <= 0
        assertThrows(IllegalArgumentException.class, () -> new Exercise("Push-Ups", "Chest", 3, 0)); // reps <= 0
        assertThrows(IllegalArgumentException.class, () -> new Exercise("Push-Ups", "Chest", -1, 15)); // sets < 0
        assertThrows(IllegalArgumentException.class, () -> new Exercise("Push-Ups", "Chest", 3, -1)); // reps < 0
    }

    // Test for valid toString
    @Test
    void validToString() {
        Exercise e = new Exercise("Push-Ups", "Chest", 3, 15);
        String expected = "Push-Ups (Chest): 3x15";
        assertEquals(expected, e.toString());
    }
}
