public class FibonacciSeries {
    void fibonacciSeries(int n,int a,int b) {
        //base case (or) edge case
        if(n==0){
            return;
        }
            int c = a+b;
            System.out.print(c+" ");
           fibonacciSeries(n-1,b,c);
        }
    public static void main(String[] args) {
        FibonacciSeries fs = new FibonacciSeries();
        fs.fibonacciSeries(10,0,1);
    }
}

