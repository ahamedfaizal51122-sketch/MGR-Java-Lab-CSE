package tamilnadu.chennai;
public class BranchOffice extends Office {
    public final int salary=10000;
    public BranchOffice(){
        //super();//super()->super class (or) parent class constructor
        System.out.println("no-args constructor in BranchOffice");
    }

    public static void main(String[] args) {
        BranchOffice b = new BranchOffice();
        b.celebrate_local_function();
        b.work();
        b.wfh();
        b.recruit();
        //b.do_business_plan(); private method cannot ve access
        System.out.println(b.salary);
        System.out.println(Office.Name);//classname.static variable name
    }

    public void celebrate_local_function() {
        System.out.println("celebrate local function");
    }
}