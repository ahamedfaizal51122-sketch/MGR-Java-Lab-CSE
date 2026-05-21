//Move All Zeros to the End of the Array 
import java.util.Arrays;
import java.util.Scanner;
public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        moveZerosToEnd(a);
        System.out.println("Array after moving zeros to the end: " + Arrays.toString(a));
    }
    static void moveZerosToEnd(int[] arr) {
        int count = 0; 
        for (int i=0;i<arr.length;i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i]; 
            }
        }
        while (count < arr.length) {
            arr[count++] = 0; 
        }
    }
}
