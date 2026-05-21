public class SumOfNaturalNumber {
    void SumOfNaturalNumber(int n,int sum) {
        //recursive case
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum += n;
        SumOfNaturalNumber(n-1,sum);
    }
    public static void main(String[] args) {
        SumOfNaturalNumber sn = new SumOfNaturalNumber();
        sn.SumOfNaturalNumber(5,0);
    }
}
