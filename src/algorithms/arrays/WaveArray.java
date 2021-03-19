package algorithms.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * The problem is to sort an array in such a way that
 * arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]....
 * Example ==> 2 1 5 4 7 6 9 8 10
 */
public class WaveArray {
    public static void main(String[] args) {
        int[] a = {2,1,5,4,7,6,9,8,10};
        solution2(a);
        System.out.println("--------Result-----------");
        IntStream.of(a).forEach(System.out::println);
    }

    private static void solution1(int[] input) {
        Arrays.sort(input);

        for (int i = 0; i<input.length - 1; i += 2) {
            swap(input,i, i+1);
        }
    }

    private static void swap(int[] input, int i, int i1) {
        int temp = input[i1];
        input[i1] = input[i];
        input[i] = temp;
    }

    private static void solution2(int[] input) {
        Arrays.sort(input);

        for (int i = 0; i<input.length - 1; i += 2) {

            // if current even number is smaller than previous
            if (i>0 && input[i] < input[i-1]) {
                swap(input, i, i-1);
            }

            // If the current even index number is smaller than the next odd index number
            if (input[i] < input[i+1]) {
                swap(input,i,i+1);
            }
        }
    }
}
