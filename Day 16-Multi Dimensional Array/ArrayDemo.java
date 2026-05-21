import java.util.Arrays;
import java.util.Scanner;
public class ArrayDemo{
    public static void main(String[] args){
        //int[] arr=new int[5];
        //int[] arr={1,2,3};
        /* for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        } */


        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        //int row=sc.nextInt();
        int[][] arr1=new int[row][col]; //Multi-dimensional array

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        //System.out.println(Arrays.toString(arr));
        // output:[1,2,3,4]



        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //System.out.println(Arrays.deepToString(arr1));
        //output:[1,2,3,4,5,6,7,8,9]
    }
}