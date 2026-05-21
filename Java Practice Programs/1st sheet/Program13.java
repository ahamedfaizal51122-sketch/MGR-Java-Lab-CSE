import java.util.Scanner;
public class Program13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int div=1;
        while(div<=n/2){
            if(n%div==0){
                count++;
            }
            div++;
        }
        System.out.print(count);
    }
    
}
