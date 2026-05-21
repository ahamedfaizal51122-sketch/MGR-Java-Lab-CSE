import java.util.Arrays;
import java.util.Scanner;
public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

        /*arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        arr[3]=sc.nextInt();
        arr[4]=sc.nextInt();
        arr[5]=sc.nextInt();*/

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
