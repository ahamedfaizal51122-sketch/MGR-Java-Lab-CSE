// Operators
import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char operation=sc.next().charAt(0);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch(operation){
            case '+':System.out.println("Addition:"+(a+b));
                       break;
            case '-':System.out.println("Subtraction:"+(a-b));
                        break;
            case '*':System.out.println("Multiplication:"+(a*b));
                        break;
            case '/':System.out.println("Divide:"+(a/b));
                        break;
            case '%':System.out.println("Modulo:"+(a%b));
                        break;
            default:System.out.println("Invalid Operation");
        }
    }
}