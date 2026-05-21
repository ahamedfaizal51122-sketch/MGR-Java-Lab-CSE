public class SuperMarket {
    String name;
    int price;
    int quantity;


    //constructor , no return type such as void,int etc.....
    //constructor automatically called
    SuperMarket(){
        System.out.println("no-args constructor");
    }

    //argument passed constructor
    SuperMarket(String name,int price,int quantiy){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public static void main(String[] args){
        SuperMarket product1=new SuperMarket();
        product1.name="icecream";
        product1.price=30;
        product1.quantity=2;

        SuperMarket product2=new SuperMarket("biscuits",20,5);
        System.out.println(product2.price);
    } 
    
}
