import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Program10 p=new Program10();
        System.out.println(p.check(a));
    }

        public boolean check(int[] nums) {
            int count=0;
            int n=nums.length;
            for(int i=0;i<n;i++){
                if(nums[i]>nums[(i+1)%n]){
                    count++;
                }
            }
        if (count<=1) {
            return true; 
        }
        return false;
        }
}
