package tamilnadu.madurai;
import tamilnadu.chennai.Office;
public class BranchOffice1 {
    void celebrate_local_function()
    {
        System.out.println("celebrating");
    }
    public static void main(String[] args){
        BranchOffice1 boffice= new BranchOffice1();
        boffice.celebrate_local_function();

        Office office=new Office();
        office.work();
    }
    
}
