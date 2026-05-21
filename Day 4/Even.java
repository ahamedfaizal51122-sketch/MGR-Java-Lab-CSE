//Even number using for and while loop
import java.util.Scanner;
public class Even {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //for loop
        for(int i=1;i<=n;i++){
            if((i&1)==0){
                System.out.println(i);
            }
        }
        int i=1;
        //while loop
        while(i<=n){
            if((i&1)==0){
                System.out.println(i);
            }
            i++;
        }
    }
    
}
