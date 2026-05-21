//Write a program to get user input from the user and find the index and return the digits present at that index.
//using Math.pow (power formula).
import java.util.Scanner;
public class DigitAtIndexMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        int temp = num;
        int length = 0;
        while (temp > 0) {
            temp /= 10;
            length++;
        }
        if (index >= 0 && index < length) {
            int divisor = (int)Math.pow(10, length - index - 1);
            int digit = (num / divisor) % 10;
            System.out.println("Digit at index " + index + " is: " + digit);
        } else {
            System.out.println("Invalid index!");
        }
        sc.close();
    }
}