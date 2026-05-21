package tamilnadu.madurai;
import tamilnadu.chennai.Office;
public class BranchOffice1 extends Office{
    BranchOffice1(){
        //super(); it calls parent class no-args constructor
        System.out.println("no-args Constructor Branch Office 1");
    }
    public static void main(String[] args){
        BranchOffice1 b=new BranchOffice1();
        b.work();
        b.wfh();
        //b.recruit(); this method is in chennai as package private
        System.out.println(b.salary);//salary is public final in office
    }
}
