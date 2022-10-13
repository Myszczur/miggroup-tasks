package pl.urbanik;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a function:
 * class Solution {public int solution(int N);}
 * that, given an integer N, returns the number of distinct digits that occur in the decimal representati
 * on of N (without leading zeros for N<>0). For example, given N = 1410 the function should return 3,
 * because there are three distinct digits in the representation of N, namely 0, 1 and 4. Given N= 0
 * the function should return 1, because the only digit that occurs in the representation of N is 0. Similarly,
 * given N = 222 the function should return 1, because the only digit that occurs in the representation of N is 2.
 * Given N = -1220 the function should return 3
 */

public class ExerciseOne {

    public static int solution(int N) {

        int positiveNumber = Math.abs(N);               // Return the absolute value of the given number
        String str = Integer.toString(positiveNumber);  // Parse the given number into a String
        Set<Integer> set = new HashSet<>();             // Create an empty Set

        for (int i = 0; i < str.length(); i++) {
            set.add(Character.getNumericValue(str.charAt(i)));  // Parsing the given string to Integer and adding the number to the set.
        }
        return set.size();      // Collection size return. Only unique numbers are included in the set,
                                // so the returned value is the unique distinct digits of the given N number.
    }

    public static void main(String[] args) {

        System.out.println(solution(1410)); // result = 3
        System.out.println(solution(0)); // result = 1
        System.out.println(solution(222)); // result = 1
        System.out.println(solution(-1220)); // result = 3

    }
}
