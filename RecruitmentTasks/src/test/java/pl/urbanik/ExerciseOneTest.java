package pl.urbanik;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseOneTest {

   @Test
    public void exerciseOneTest() {

        int a = 1410;
        int b = 0;
        int c = 222;
        int e = -1220;
        long valueToCheck1 = ExerciseOne.solution(a);
        long valueToCheck2 = ExerciseOne.solution(b);
        long valueToCheck3 = ExerciseOne.solution(c);
        long valueToCheck4 = ExerciseOne.solution(e);

        assertEquals(3, valueToCheck1);
        assertEquals(1, valueToCheck2);
        assertEquals(1, valueToCheck3);
        assertEquals(3, valueToCheck4);
    }
}