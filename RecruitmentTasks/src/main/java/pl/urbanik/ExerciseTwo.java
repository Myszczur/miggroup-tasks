package pl.urbanik;


/**
 * Write a function:
 * class Solution { public int solution(int A, int B, int K); }
 * that, given three integers A, B and K, returns the number of integers within the range [A..B]
 * that are divisible by K, i.e.:  { i : A ≤ i  ≤ B, i mod K = 0 }
 * For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are
 * three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
 * Assume that: A and B are integers within the range [0..2,000,000,000];
 * K is an integer within the range [1..2,000,000,000];
 * A ≤ B.
 **/

public class ExerciseTwo {

    public static int solution(int A, int B, int K) {

        int result = B / K - A / K;  // B / K gives total numbers divisible by K [1..B]
                                     // A / K gives total numbers divisible by K [1..A]
                                     // Subtract, this gives integers divisible by K [A..B]
        if (A % K == 0) {
            result++;
        }
        return result;              // Check A % K == 0, if true then increment the result by one.
                                    // We return a result which is the number of numbers divisible by K
    }

    public static void main(String[] args) {

        System.out.println(solution(6, 11, 2));
    }
}
