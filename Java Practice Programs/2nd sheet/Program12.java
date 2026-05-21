import java.util.Arrays;
public class Program12 {
    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        int k=7;
        rotate(a,k);
    }
    
    static void rotate(int[] arr,int k)
    {
        int n=arr.length;
        if(k%n==0)
        {
            return;
        }
            k=k%n;//2

            reverse(0,n-1,arr);//[5,4,3,2,1]
            reverse(0,k-1,arr);//[4,5,3,2,1]
            reverse(k,n-1,arr);//[4,5,1,2,3]
            System.out.println(Arrays.toString(arr));
    }
    static void reverse(int i,int j,int[] arr)
    {
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