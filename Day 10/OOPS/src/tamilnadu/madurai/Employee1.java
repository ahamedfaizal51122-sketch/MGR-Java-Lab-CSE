package tamilnadu.madurai;
import tamilnadu.chennai.Office;

public class Employee1 {

    String name;

    public static void main(String[] args){
        Employee1 emp1=new Employee1();
        emp1.name="AAKASH";

        Office office=new Office();
        office.work();
        //office.wfh();
        System.out.println(office.salary);

    }
}
