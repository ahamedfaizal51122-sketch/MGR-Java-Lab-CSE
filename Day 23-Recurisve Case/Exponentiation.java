public class Exponentiation {

    //base case
    double findPow(double x,int n){
       if(n == 0){
            return 1;
       }
       if(x == 0){
            return 0;
       }
        if(x<0){
            x = 1/x;
            n = -(n);
        }
        //iterative approach
        /*double result = 1;
        while(n!=0){
            result = result * x;
            n--;
        }
        return result;*/
        if(n%2 == 0){
            return findPow(x, n/2)*findPow(x, n/2);
        }
        else{
            return x * findPow(x, n/2);
        }
    }

    public static void main(String[] args) {
        Exponentiation exp = new Exponentiation();
        System.out.println(exp.findPow(2, 4));
    }
}
