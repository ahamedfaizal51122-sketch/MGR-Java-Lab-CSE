import java.util.Arrays;
 public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {5, 2, 9, 1, 4};
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
