package pl.urbanik;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTwoTest {

    @Test
    public void exerciseTwoTest() {

        int a = 6;
        int b = 11;
        int k = 2;

        assertEquals(3, ExerciseTwo.solution(a, b, k));
    }
}