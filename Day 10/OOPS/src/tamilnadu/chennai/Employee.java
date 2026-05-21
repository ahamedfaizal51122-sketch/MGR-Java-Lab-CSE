package tamilnadu.chennai;

public class Employee {
    String name;

    public static void main(String[] args){
        Employee emp=new Employee();
        emp.name="FAIZAL";

        Office office=new Office();
        office.work();
        office.wfh();
        //office.do_business_plan();
        System.out.println(office.salary);
        //office.salary=50000; cannot assign th erevalue which are assigned in a final
        System.out.println(office.salary);
    }
}
