
public class PrintNumber {
    void printNumber(int n) {
        //base case (or) edge case
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
    public static void main(String[] args) {
        PrintNumber pn = new PrintNumber();
        pn.printNumber(5);
    }  
}
