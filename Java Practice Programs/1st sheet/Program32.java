import java.util.Scanner;
public class Program32 {
    void convert(String str) {
        int num = Integer.parseInt(str);
        System.out.println("Number = " + num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Program32 obj = new Program32();
        obj.convert(str);
    }
}