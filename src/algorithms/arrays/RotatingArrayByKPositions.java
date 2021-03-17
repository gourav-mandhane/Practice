package algorithms.arrays;

public class RotatingArrayByKPositions {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8};
        rightRotate(input, 2);
        leftrotate(input, 2);
        // 3,4,5,6,7,8,1,2
    }

    private static void leftrotate(int[] input, int k) {
        int length = input.length;
        k = k % length;
        int j =0;
        for (int i = 0; i < length; i++) {
            if (i < length - k) {
                System.out.println(input[i + k]);
            } else {
                System.out.println(input[j++]);
            }
        }
    }

    private static void rightRotate(int[] input, int k) {
        int length = input.length;
        k = k % length;

        for (int i = 0; i < length; i++) {
            if (i < k) {
                System.out.println(input[length + i - k]);
            } else {
                System.out.println(input[i - k]);
            }
        }
        System.out.println("---------------------------");
    }


}
