//Write a program for a  Count of Divisor? Input: 10  Output: 3 
import java.util.Scanner;
public class CountOfDivisor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int div=1;
        while(div<=n/2){
            if(n%div==0){
                count++;
            }
            div++;
        }
        System.out.print(count);
    }
    
}
