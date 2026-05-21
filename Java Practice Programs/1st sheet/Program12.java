import java.util.Scanner;
public class Program12 {
    void findDivisors(int num) {
        System.out.println("Divisors of " + num + " are:");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Program12 obj = new Program12();   
        obj.findDivisors(num);
    }
}

