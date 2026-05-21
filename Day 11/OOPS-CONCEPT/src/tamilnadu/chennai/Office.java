package tamilnadu.chennai;

public class Office {

    static String Name="TCS";
    public Office(){
        System.out.println("No-args constructor in Office");
    }

    public final int salary=20000;

    public void work(){
        System.out.println("Working in Office");
    }
    protected void wfh(){
        System.out.println("working in home");
    }
    void recruit(){
        System.out.println("recruiting in office");
    }
    private void do_business_plan(){
        System.out.println("do business plan");
    }

    public static void main(String[] args){
        System.out.println("TCS");
    }
}
