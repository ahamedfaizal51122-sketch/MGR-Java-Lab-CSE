package example.diamondpattern;

public class Child1 extends Parent1 {
    @Override
    void repay() {
        System.out.println("I'll repay behalf of my parents");
    }

    public static void main(String[] args){
        Child1 child1=new Child1();
        child1.repay();
        child1.getLoan();
    }
}
