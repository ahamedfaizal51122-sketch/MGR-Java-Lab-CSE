public class Demo3 {
    boolean check(String s, int left, int right){
        if(left >= right){
            return true;
        }
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return check(s, left+1, right-1);
    }
    public static void main(String[] args) {
        Demo3 demo = new Demo3();
        String s="hello";
        System.out.println(demo.check(s, 0, s.length()-1));
    }
}
