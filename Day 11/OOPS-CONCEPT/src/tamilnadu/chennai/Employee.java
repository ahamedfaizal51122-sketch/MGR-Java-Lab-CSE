package tamilnadu.chennai;

public class Employee {
    String name;

    public static void main(String[] args){
        Employee emp=new Employee();
        emp.name="Faizal";

        Office tcs=new Office();
        tcs.work();
        tcs.wfh();
        tcs.recruit();
        //tcs.do_business_plan(); private methods cannot be access
        System.out.println("Name: "+emp.name);
        System.out.println(tcs.salary);
        //tcs.salary=50000; cannot override final variable

    }
}
