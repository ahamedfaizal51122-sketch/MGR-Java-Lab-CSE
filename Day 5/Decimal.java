//Write a program to find the binary to decimal? op:1101     ans:13
//char to integer
//power formula=Math.pow(base,power) which always return double so we use narrow typecasting to convert double to int
//Narrow typecasting is used in line no.14 (int) because of 2 power 0=1  which gives 1.0 as doble use int to convert 1.0 to 1
import java.util.Scanner;
public class Decimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //1101
        String binary=sc.next(); // next()-> Single Word without space "1101"->String
        int power=0, decimal=0;
        for(int i=binary.length()-1;i>=0;i--) //length() of the String is 4 , value of i is 3 (i=3),3>=0
            {
                int val=binary.charAt(i)-'0'; // chartAt(index)=charAt(3)=>index of 3 is 1
                decimal=decimal + val * (int) Math.pow(2,power++);
        }
        System.out.print(decimal);//13
    }
}
