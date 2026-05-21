package example.diamondpattern;

public abstract class Parent {

    Parent()
    {
        System.out.println("Parent");
    }

    void work()
    {
        System.out.println("working in home");
    }

    abstract void study();

    public static void main(String[] args) {
        //Parent p=new Parent();
        //p.work();
        //p.study();
        /*
         * for abstract class we cannot create object
         * we can have constructor
         */

    }
}
