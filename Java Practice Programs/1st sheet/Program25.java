import java.util.Scanner;
public class Program25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 9) {
            int sum = 0;
            while (num != 0) {
                int digit = num % 10; 
                sum = sum + digit;   
                num = num / 10;      
            }
            num = sum; 
        }
        System.out.println("Single Digit Sum = " + num);
    }
}