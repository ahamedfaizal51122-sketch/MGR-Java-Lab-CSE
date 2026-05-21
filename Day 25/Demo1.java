// Climbing Stairs problem using Dynamic Programming memoization
import java.util.Arrays;
class Demo1 {
    //!memoization
     /*public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
     }
     public int helper(int n,int[] dp){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=helper(n-1,dp)+helper(n-2,dp);
        return dp[n];
     }*/
    //!tabulation
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int dp[] = new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
        }
        public static void main(String[] args) {
            int n = 4;
            Demo1 d = new Demo1();
            int result = d.climbStairs(n);
            System.out.println(result);
        }
}


