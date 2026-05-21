import java.util.Scanner;
public class Program11 {
    void countDigits(int num) {
        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            num = Math.abs(num); 
            while (num > 0) {
                num = num / 10;
                count++;
            }
        }
        System.out.println("Number of digits = " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Program11 obj = new Program11();  
        obj.countDigits(num);
    }
}
