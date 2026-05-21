package tamilnadu.chennai;
public class Office{
    
    public void work(){
        System.out.println("Working in Office");
    }
    protected void wfh(){
        System.out.println("Working in home");
    }
    void recruitment(){
        System.out.println("recruiting");
    }
    private void do_business_plan(){
        System.out.println("planning");
    }

    public static void main(String[] args) {
        Office office=new Office();
        office.work();
        office.wfh();
        office.recruitment();
        office.do_business_plan();
    }

}


// javac -d . classname.java(to compile)
// java package name class name(to run)