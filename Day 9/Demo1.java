class Car{
    String name;
    int speed;
    Car(){
    System.out.println("No-args Constructor");
    }
    Car(String name, int speed){
        this.name=name;
        this.speed=speed;
    }
    void display(){
        System.out.println(name+" "+speed);
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Car audi=new Car("AUDI",120);
        //audi.name="AUDI";
        //audi.speed=120;
        audi.display();
    }
    
}
