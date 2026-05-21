import java.util.Scanner;
public class Program27 {
    void printPrime(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (num < 2) 
                continue;
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        Program27 obj = new Program27();
        obj.printPrime(start, end);
    }
}