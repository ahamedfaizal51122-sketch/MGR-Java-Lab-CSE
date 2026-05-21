import java.util.Scanner;
public class Program3 {
    void calculate(int a,int b,char op){
        switch(op){
            case '+':
                System.out.println("Addition= "+(a+b));
                break;
            case '-':
                System.out.println("Subtraction= "+(a-b));
                break;
            case '*':
                System.out.println("Multiplication: "+(a*b));
                break;
            case '/':
                System.out.println("Divison: "+(a/b));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char op=sc.next().charAt(0);
        Program3 cal=new Program3();
        cal.calculate(a,b,op);
    }
}
