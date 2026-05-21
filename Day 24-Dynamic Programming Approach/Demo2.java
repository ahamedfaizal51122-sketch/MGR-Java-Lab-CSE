// Memoization and Tabulation approaches to calculate Fibonacci numbers
import java.util.Arrays;
public class Demo2 {
    public int fibmem(int n){
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n, dp);
    }
    //memoization
    int helper(int n,int[] dp){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n] = helper(n-1, dp) + helper(n-2, dp);
        return dp[n];
    }
    //Tabulation
    public int fibtab(int n){
        if(n<=1){
            return n;
        }
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 6;
        Demo2 demo = new Demo2();
        System.out.println(demo.fibmem(n));
        System.out.println(demo.fibtab(n));
    }
}
