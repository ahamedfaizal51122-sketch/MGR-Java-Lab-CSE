public class SumOfDigits {
    void SumOfDigits(int n,int sum) {
        //base case (or) edge case
        if(n==0){
            System.out.println(sum);
            return;
        }
        int rem = n%10;
        sum += rem;
        SumOfDigits(n/10,sum);
    }
    public static void main(String[] args) {
        SumOfDigits sd = new SumOfDigits();
        sd.SumOfDigits(123,0);
    }    
}

