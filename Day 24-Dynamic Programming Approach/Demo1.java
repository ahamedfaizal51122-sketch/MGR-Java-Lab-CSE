//Write a program to print all subsequences of a given string["abc"]?
public class Demo1 {
    void subsequences(String s, int index, String combination){
        if(index == s.length()){
            System.out.println(combination);
            return;
        }
        //include the current character
        subsequences(s, index+1, combination + s.charAt(index));
        //exclude the current character
        subsequences(s, index+1, combination);
    }
    public static void main(String[] args) {
        String s = "abc";
        Demo1 demo = new Demo1();
        demo.subsequences(s, 0, "");
    }
}
