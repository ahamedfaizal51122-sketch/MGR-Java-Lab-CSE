import java.util.Scanner;
public class SingleNumber {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        SingleNumber s=new SingleNumber();
        System.out.println(s.singleNumber(a));
    }

     public int singleNumber(int[] nums) {
        int xor=0;
        for(int i=0;i<nums.length;i++)
        {
            xor=xor^nums[i];
        }
        return xor;   
    }
}
