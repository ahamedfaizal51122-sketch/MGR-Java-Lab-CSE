import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Program2 p2 = new Program2();
        if(p2.checkPalindrome(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
    boolean checkPalindrome(String s) {
        int n=s.length();
        char ch[]=s.toCharArray();
        //['M','A','D','A','M']
        for (int i=0;i<n/2;i++) {
            char temp=ch[n-i-1];
            ch[n-i-1]=ch[i];
            ch[i]=temp;
        }
        return new String(ch).equals(s);
    }
}