import java.util.Arrays;

public class StringDemo1 {
    public static void main(String[] args){
        String str=new String("hello");

        //toUpperCase() method
        System.out.println(str.toUpperCase());
        System.out.println(str);

        //toLowerCase() method
        String str1=new String("HELLO");
        System.out.println(str1.toLowerCase());
        System.out.println(str1);

        //trim() method
        String str2="  hello world   ";
        System.out.println(str2);
        System.out.println(str2.trim());

        //toCharArray() method
        String s1="hello world";
        char[] ch=s1.toCharArray();
        //['h','e','l','l','o',' ','w','o','r','l','d']
        System.out.println(Arrays.toString(ch));

        String s2=new String(ch);
        System.out.println(s2);
    }
    
}
