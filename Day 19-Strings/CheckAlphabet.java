import java.util.Scanner;
public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("It is an Alphabet");
        } else {
            System.out.println("It is NOT an Alphabet");
        }
    }
}
