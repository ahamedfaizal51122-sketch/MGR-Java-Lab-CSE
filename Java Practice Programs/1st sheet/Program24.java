import java.util.Scanner;
public class Program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        if (num < 0) {
            System.out.println("Square root not defined for negative numbers");
        } else {
            double result = Math.sqrt(num);
            System.out.println("Square Root = " + result);
        }
    }
}