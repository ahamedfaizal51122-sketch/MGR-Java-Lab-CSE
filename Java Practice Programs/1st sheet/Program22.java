import java.util.Scanner;
public class Program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = 1; 
        if (num < 0) {
            System.out.println("Factorial not defined for negative numbers");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial = " + factorial);
        }
    }
}