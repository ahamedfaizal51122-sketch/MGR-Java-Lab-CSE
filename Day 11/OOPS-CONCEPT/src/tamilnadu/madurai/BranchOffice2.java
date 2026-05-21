package tamilnadu.madurai;
import tamilnadu.chennai.BranchOffice;

    public class BranchOffice2 extends BranchOffice{
        BranchOffice2(){
            //super();
            System.out.println("no-args Constructor in BranchOffice2");
        }
        public static void main(String[] args) {
            BranchOffice2 b = new BranchOffice2();
            b.provide_lunch();
            b.work();
            b.wfh();//this method is protected in office can be accessible
            b.celebrate_local_function();
            System.out.println(b.salary);//this is branchOffice salary=10000
            b.get_salary();
            //System.out.println(super.salary);//super and this keyword cannot be used in static area
        }

        void provide_lunch()
        {
            System.out.println("lunch provided");
        }

        void get_salary()
        {
            System.out.println(super.salary);//try to access Office class
        }
}
