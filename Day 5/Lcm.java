// Write a program to find LCM of a given number? o/p:12 18 ans:36
import java.util.Scanner;
public class Lcm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int max=(a>b)?a:b;
        while(true){
            if(max%a==0 && max%b==0){
                System.out.print(max);
                break;
            }
            max++;
        }
    }
    
}
