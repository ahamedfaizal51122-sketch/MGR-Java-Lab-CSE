import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StrongNumber st=new StrongNumber();
        if(st.findStrongNumber(n)==n)
        {
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not Strong Number");
        }
    }

    int findStrongNumber(int n){
        int sum=0;
        while(n!=0)
            {
            int rem=n%10;
            sum=sum+findFact(rem);
            n=n/10;
        }
        return sum;
    }

    static int findFact(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    
}
