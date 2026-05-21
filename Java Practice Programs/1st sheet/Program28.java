import java.util.Scanner;
public class Program28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Program28 obj = new Program28();
        obj.checkPerfect(num);
    }
        void checkPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not Perfect Number");
        }
    }
}