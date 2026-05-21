//Method Overloading example:
public class Calculator {
    //compile-time polymorphism
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    /*int add(int a,int b)
    {

    }*/
    void add (double a,double b)
    {
        System.out.println(a+b);
   }
    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        cal.add(2,3);
        cal.add(2,3,4);
    }
}
