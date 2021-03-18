package algorithms;


import java.util.stream.IntStream;

public class MergeSortDemo {
    public static void main(String[] args) {
        int[] a = {2,1,5,4,7,6,9,8};
        sort(a, 0, a.length - 1);
        System.out.println("--------Result-----------");
        IntStream.of(a).forEach(System.out::println);
    }

    private static void sort(int[] input, int begin, int end) {
        // base condition
        if (begin < end) {
            int mid = (begin + end) / 2;
            sort(input, begin, mid);
            sort(input, mid + 1, end);
            merge1(input, begin, mid, end);
        }
    }

    static void merge(int arr[], int beg, int mid, int end)
    {

        int l = mid - beg + 1;
        int r = end - mid;

        int LeftArray[] = new int [l];
        int RightArray[] = new int [r];

        for (int i=0; i<l; ++i)
            LeftArray[i] = arr[beg + i];

        for (int j=0; j<r; ++j)
            RightArray[j] = arr[mid + 1+ j];


        int i = 0, j = 0;
        int k = beg;
        while (i<l&&j<r)
        {
            if (LeftArray[i] <= RightArray[j])
            {
                arr[k] = LeftArray[i];
                i++;
            }
            else
            {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i<l)
        {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j<r)
        {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    private static void merge1(int[] input, int begin, int mid, int end) {

        int[] result = new int[input.length];

        // deduce sizes of left and right arrays
        int leftSize = mid - begin + 1;
        int rightSize = end - mid;

        // create temporary arrays
        int[] L = new int[leftSize];
        int[] R = new int[rightSize];

        // copy the contents in both the above arrays

        for (int i = 0; i < leftSize; i++) {
            L[i] = input[begin + i];
        }

        for (int i = 0; i < rightSize; i++) {
            R[i] = input[mid + i + 1];
        }

        int k = begin;
        int i = 0;
        int j = 0;

        // base condition
        while(i < leftSize && j < rightSize) {
            if (L[i] <= R[j]) {
                input[k] = L[i];
                i++;
            } else {
                input[k] = R[j];
                j++;
            }
            k++;
        }

        // remaining elements just copy them

        while (i < leftSize) {
            input[k] = L[i];
            k++;
            i++;
        }

        while (j < rightSize) {
            input[k] = R[j];
            k++;
            j++;
        }
    }
}


