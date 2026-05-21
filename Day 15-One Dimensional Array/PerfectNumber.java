import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==findPerfectNumber(n)){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfect Number");
        }
    }
    
    static int findPerfectNumber(int n){
        int sum=0;
        int div=1;
        while(div<=n/2)
        {
            if(n%div==0)
            {
                sum=sum+div;
            }
            div++;
        }
        return sum;
    }
    
}
