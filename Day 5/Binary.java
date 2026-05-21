//Write a program to find the decimal number to binary? op:12 ans:1100
// here we use concatenation :0+""="0",0+"0"="00",1+"00"="100",1+"00"="1100".
//Decimal to BinaryS
import java.util.Scanner;
public class Binary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String binary="";
        while(n!=0){
            binary=(n%2)+binary;
            n=n/2;
        }
        System.out.print(binary);
    }
}
