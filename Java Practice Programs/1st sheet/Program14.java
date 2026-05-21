import java.util.Scanner;
public class Program14 {
    void findGCD_LCM(int a, int b) {
        int x = a;
        int y = b;
        // GCD using Euclidean Algorithm
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;
        // LCM formula
        int lcm = (a * b) / gcd;
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Program14 obj = new Program14();   
        obj.findGCD_LCM(a, b);
    }
}

