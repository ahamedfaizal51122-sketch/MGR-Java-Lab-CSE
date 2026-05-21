//Write a program to find the Exponentiation without using Math.pow?
import java.util.Scanner;
public class Exponentiation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int power=sc.nextInt();
        double result=1;
        if(power<0){
            base=1%base;
            power=-(power);
        }
        while(power!=0){
            result=result*base;
            power--;
        }
        System.out.print(result);
    }
    
}
