package tamilnadu.chennai;

public class Office {
    public final int salary=20000;
    //Constructor (no-argument Constructor)
    public Office(){
        System.out.println("Welcome to Office");
    }
    public static void main(String[] args){
        Office office=new Office();
        office.work();
        office.wfh();
        office.recruit();
        office.travel_allowance();
        office.do_business_plan();
        System.out.println(office.salary);
    }
    public void work(){
        System.out.println("working in office");
    }
    protected void wfh(){
        System.out.println("working in home");
    }
    void recruit(){
        System.out.println("recruiting in office");
    }
    void travel_allowance(){
        System.out.println("provide travel allowance");
    }
    private void do_business_plan(){
        System.out.println("do business plan");
    }
}
