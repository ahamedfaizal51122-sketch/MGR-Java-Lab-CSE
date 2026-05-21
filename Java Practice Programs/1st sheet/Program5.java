import java.util.Scanner;
public class Program5 {
    void convertTemp(double f) {
        double c = (f - 32) * 5 / 9;
        System.out.println("Celsius = " + c);//37.0
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble(); //98.6
        Program5 obj = new Program5();   
        obj.convertTemp(f);
    }
}