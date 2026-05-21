import java.util.Scanner;
public class Program16 {
    void reverseNumber(int num) {
        int rev = 0;
        int original = num;           
        num = Math.abs(num);          
        while (num > 0) {
            int digit = num % 10;     
            rev = rev * 10 + digit;   
            num = num / 10;           
        }
        if (original < 0) {
            rev = -rev;
        }
        System.out.println("Reversed number = " + rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Program16 obj = new Program16();   
        obj.reverseNumber(num);
    }
}
