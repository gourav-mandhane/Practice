package algorithms.arrays;

import java.util.stream.IntStream;

public class LongestSubArraySum {
    public static void main(String[] args) {
        int[] a = {1,-2,3,4,-4,6,-4,3,2};
        int sum = solution(a);
        System.out.println("--------Result-----------");
        System.out.println(sum);
    }

    private static int solution(int[] input) {

        int sum = 0;
        int nextValue = 0;
        for (int j : input) {
            nextValue = nextValue + j;

            if (nextValue < 0) {
                nextValue = 0;
            }
            if (sum < nextValue) {
                sum = nextValue;
            }
        }
        return sum;
    }
}
