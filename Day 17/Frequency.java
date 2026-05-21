//Write a program to find the frequency of each element?
public class Frequency {
    public static void main(String[] args) {
        int[] a={1,2,1,1,2,2,3,3,4};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i])
                max=a[i];
        }
        int[] dp=new int[max+1];
        for(int i=0;i<a.length;i++){
            dp[a[i]]++;
        }
        for(int i=0;i<dp.length;i++){
            if(dp[i]>0){
                System.out.println(i+" "+dp[i]+" ");
            }
        }
    }
}
