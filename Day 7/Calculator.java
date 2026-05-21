public class Calculator {
    //method declaration
    //without returntype and without arguments
    void add()
    {
        int a=10,b=20;
        System.out.println(a+b); 
    }
    //without returntype and with arguments
    void mul(double a, double b){
        System.out.println(a*b);
    }
    public static void main(String[] args){
        Calculator c=new Calculator();
        c.add();
        int result= c.sub();
        System.out.println(result);
        c.mul(2.0,4.0);
        result=div(4,2);
        System.out.println(result);
    }
    //with returntype and without arguments
    int sub(){
        int a=10,b=5;
        return a-b;  //non-static 
    }
    //with returntype and with arguments
    static int div(int a,int b){
        return a/b;
    }
}
