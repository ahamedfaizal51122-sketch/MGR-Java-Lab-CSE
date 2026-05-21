import java.util.Scanner;
public class Program6 {
    void swap(int a, int b) {
        // swapping without third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Program6 obj = new Program6();   
        obj.swap(a, b);
    }
}