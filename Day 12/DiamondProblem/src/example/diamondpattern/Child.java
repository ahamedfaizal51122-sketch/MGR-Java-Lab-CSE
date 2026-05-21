package example.diamondpattern;

public class Child extends Parent{

    Child(){
        //super(); call parent class no-args constructor
        System.out.println("Child");
    }

    @Override // Annotations
    void study() {
        System.out.println("Java Programming");
    }

    public static void main(String[] args){
        Child child=new Child();
        child.work();
        child.study();
    }
}
