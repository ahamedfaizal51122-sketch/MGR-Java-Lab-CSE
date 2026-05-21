import java.util.Scanner;
public class Program29 {
    void printFactors(int num) {
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Program29 obj = new Program29();
        obj.printFactors(num);
    }
}