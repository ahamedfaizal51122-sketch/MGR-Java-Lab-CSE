public class StringDemo3 {
    public static void main(String[] args){
        //StringBuffer sb=new StringBuffer();
        StringBuilder sb=new StringBuilder("hello");
        sb.append("world");
        System.out.println(sb);

        //hashCode() method
        System.out.println(sb.hashCode());
        sb.append("java");
        System.out.println(sb);

        //insert() method
        StringBuilder sb1=new StringBuilder("hello");
        sb1.insert(0, " world");
        System.out.println(sb1);

        //reverse() method
        StringBuilder sb2=new StringBuilder("MADAM");
        System.out.println(sb2.reverse());
        System.out.println(sb2);

        //deleteCharAt() method
        StringBuilder sb3=new StringBuilder("sky");
        System.out.println(sb3.deleteCharAt(1));
        System.out.println(sb3);
    }
}
