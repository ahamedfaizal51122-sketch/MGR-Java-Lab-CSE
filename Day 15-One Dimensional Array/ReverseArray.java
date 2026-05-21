// Write a program to reverse an array without using extra space? (Two-Pointer Approach)

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        //[5,4,3,2,1];
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    
    static void reverse(int[] arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
