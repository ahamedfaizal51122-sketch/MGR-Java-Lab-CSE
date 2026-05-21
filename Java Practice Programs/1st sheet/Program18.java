import java.util.Scanner;
public class Program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;   
        int sum = 0;          
        int digits = 0;
        int temp = num;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits); 
            temp=temp/10;
        }
        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
