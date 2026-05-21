import java.util.Scanner;
public class Program20 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        String binary=sc.next(); 
        int power=0, decimal=0;
        for(int i=binary.length()-1;i>=0;i--) 
            {
                int val=binary.charAt(i)-'0'; 
                decimal=decimal + val * (int) Math.pow(2,power++);
        }
        System.out.print(decimal);
    }
}
