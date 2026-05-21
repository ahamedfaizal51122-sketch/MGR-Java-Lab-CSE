import java.util.Arrays;//import java.util.*;
public class ArrayDemo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(arr);//[I@251a69d7
        //System.out.println(arr[0]);
        //System.out.println(arr[1]);
        //System.out.println(arr[arr.length-1]);   
        
        /*for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }*/

        /*for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }*/

    //Cursors
        /*for(int val:arr)
        {
            System.out.println(val);
        }*/

        System.out.println(Arrays.toString(arr));
    }
}