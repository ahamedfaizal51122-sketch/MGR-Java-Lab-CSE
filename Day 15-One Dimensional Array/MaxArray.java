import java.util.Arrays;
import java.util.Scanner;
public class MaxArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //[32,12,25,42,15] ,n=5
        MaxArray m1=new MaxArray();
        System.out.println(m1.findMax(arr));
    }

    int findMax(int[] a)
    {
        //Arrays.sort(a);//[12,15,25,32,42]  using sort we find max
        //return a[a.length-1];

        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(max<a[i]) // if we put > instead of > we find minimum value
            {
                max=a[i];
            }
        }
        return max;
    }
}