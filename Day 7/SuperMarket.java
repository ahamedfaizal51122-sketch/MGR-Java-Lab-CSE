public class SuperMarket {
    int quantity;
    int price;
    String productName;
    //static variable
    static String NAME="D-MART";
    public static void main(String[] args) {
        // when object is created constructor is called
        SuperMarket product1=new SuperMarket();
        product1.productName="Biscuits";
        product1.price=10;
        product1.quantity=5;

        SuperMarket product2=new SuperMarket();
        product2.productName="icecream";
        product2.price=30;
        product2.quantity=1;

        System.out.println(product1.productName);
        System.out.println(NAME);
        System.out.println(product1);
      }
}
