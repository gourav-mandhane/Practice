package algorithms;

public class InsertionSortDemo {
    public static void main(String[] args) {
    sort();
    }

    static void sort() {
        int a[] ={4,2,5,1,6};
        int temp;
        for (int i=1;i<a.length;i++) {
            for (int j=i; j>0;j--) {
                if (a[j] > a[j-1]) {
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        for(int k=0;k<a.length;k++) {
            System.out.println(a[k]);
        }
    }
}
