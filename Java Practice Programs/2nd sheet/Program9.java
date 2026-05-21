import java.util.Arrays;
public class Program9 {
    public static void main(String[] args){
        int[] a={32,12,25,42,15};
        System.out.println(findSecondMax(a));
    }
    static int findSecondMax(int[] a){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int val:a){
            if(first<val)
            {
                second=first;
                first=val;
            }else if(second<val)
            {
                second=val;
            }
        }
        return second;
    }
}
