public class StringDemo {
    public static void main(String[] args)
    {
        String str=new String("hello world");
        
        //indexOf(String str) method
        System.out.println(str.indexOf("world"));

        //indexOf(int ch) method
        System.out.println(str.indexOf(101));

        //lastIndexOf(String str) method
        System.out.println(str.lastIndexOf("l"));

        //substring(fromIndex,endIndex) method
        System.out.println(str.substring(6,10));
        System.out.println(str.substring(6));

        //StringIndexOutOfBoundsException
        //System.out.println(str.substring(-1));

        //charAt(index) method
        System.out.println(str.charAt(3));


    

    }
}
