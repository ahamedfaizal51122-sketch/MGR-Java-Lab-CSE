import java.util.Scanner;
public class Program7 {
    void findGreatest(int a, int b) {
        if (a > b) {
            System.out.println("Greatest number is: " + a);
        } 
        else {
            System.out.println("Greatest number is: " + b);
        } 
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Program7 obj = new Program7();   
        obj.findGreatest(a, b);
    }
}