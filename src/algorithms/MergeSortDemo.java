package algorithms;


public class MergeSortDemo {
    public static void main(String[] args) {
        int[] a = {2,1,5,4,7,6,9,8};
        sort(a, 0, a.length -1);
    }
    static void sort(int a[], int lb, int ub) {
        // base condition
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            sort(a, lb, mid);
            sort(a, mid + 1, ub);
            merge(a, lb, mid, ub);
        }
    }

    private static void merge(int[] a, int lb, int mid, int ub) {
        int i = lb;
        int j = mid;
        int k = lb;
        int b[] = new int[a.length];
        while (i <= mid && j <= ub) {
            if (a[i] <= a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }
        // left overs
        if (i > mid) {
            while (j <= ub) {
                b[k] = a[j];
                j++;
                k++;
            }
        } else {
            while (i <= mid) {
                b[k] = a[i] ;
                i++;
                k++;
            }
        }

        for (int d =0;d<b.length;d++) {
            System.out.println(b[d]);
        }
    }
}


