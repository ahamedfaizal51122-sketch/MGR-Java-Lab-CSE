// Write a program to find the devices of given number? o/p: 18 ans: 1 2 3 6 9 18
import java.util.Scanner;
public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div=1;
        while (div<=n/2){
            if(n%div==0){
                System.out.print(div+" ");
            }
            div++;
        }
        System.out.print(n);
    }
}