package algorithms.arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8};
        int index = bSearch(input, 0, input.length - 1, 9);
        System.out.println(index);
    }

    private static int bSearch(int[] input, int start, int end, int value) {

        // base condition
        while (start <= end) {
            int mid = (start + end) / 2;
            // there is alternative to avoid overflow

            if (input[mid] == value) {
                return mid;
            }
            if (value < input[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}