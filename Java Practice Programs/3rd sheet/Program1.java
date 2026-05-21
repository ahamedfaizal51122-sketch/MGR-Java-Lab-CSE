import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        ch=Character.toLowerCase(ch);
        Program1 p1=new Program1();
        p1.check(ch);

    }

    public void check(char ch){
        ch=(char)(ch-32);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                System.out.println("It is a Vowel");
            }else{
                System.out.println("It is a Consonant");
            }
        }
    }   
