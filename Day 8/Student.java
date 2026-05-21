package tamilnadu.chennai.mgr;
public class Student {
    void study(){
        System.out.println("studying");
    }

    public static void main(String[] args){
            College mgr =new mgr();
            mgr.admission();
            mgr.auditorium();
            mgr.cabin();
            mgr.canteen();
            mgr.study();

            Student student1=new Student();
            student1.study();
    }
    
}
