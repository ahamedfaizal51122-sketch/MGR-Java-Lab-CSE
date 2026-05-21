public class StringDemo2 {
    public static void main(String[] args){
        String str=new String("hello");
        System.out.println(str.length());

        //isBlank() return true if it is empty or conatins whitespace only otherwise it will return false
        String s1=new String(" ");
        System.out.println(s1.isBlank());

        //isEmpty() if the length of the string is zero then it will return true otherwise false
        String s2=new String("");
        System.out.println(s2.isEmpty());
        
        //equals() method is used to compare the content of the string
        String s3=new String("hi");
        String s4=new String("hello");
        System.out.println(s3.equals(s4));

        //equalsIgnoreCase() method is used to compare the content of the string without considering the case
        String s5=new String("Hi");
        String s6=new String("hi");
        System.out.println(s5.equalsIgnoreCase(s6));

        //compareTo() method is used to compare the content of the string lexicographically 
        //'H' has ASCII value 72 and 'h' has ASCII value 104 so the result will be 72-104=-32
        String s7=new String("Hi");//hi 
        String s8=new String("hi");//Hi 
        System.out.println(s7.compareTo(s8));

        //compareToIgnoreCase() method is used to compare the content of the string lexicographically without considering the case
        System.out.println(s7.compareToIgnoreCase(s8));

        //startsWith() method is used to check whether the string starts with the specified prefix or not
        String s9=new String("the sky is blue");
        System.out.println(s9.startsWith("t"));
        System.out.println(s9.startsWith("i",8));

        //endsWith() method is used to check whether the string ends with the specified suffix or not
        String s10=new String("hello world");
        System.out.println(s10.endsWith("rld"));

        //contentEquals() method is used to compare the content of the string with the specified string
        String s11=new String("i am learning java");
        System.out.println(s11.contentEquals("i am learning java"));

        //contains() method is used to check whether the string contains the specified sequence of char values or not
        String s12=new String("hello");
        System.out.println(s11.contains("l"));

    }
    
}
