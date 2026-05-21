import java.util.Scanner;
public class Program4 {
    void simpleInterest(int p,int n,int r){
        double si=(p*n*r)/100.0;
        System.out.println("Simple Interest: "+si);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();//1000
        int n=sc.nextInt();//2
        int r=sc.nextInt();//5
        Program4 obj=new Program4();
        obj.simpleInterest(p,n,r);        
    }
}
