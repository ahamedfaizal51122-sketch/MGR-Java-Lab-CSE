import java.util.Scanner;
public class Program2 {
    void gradeSystem(int mark){
        switch(mark/10)
        {
            case 10:
            case 9:System.out.println("A GRADE");
                break;
            case 8:System.out.println("B GRADE");
                break;
            case 7:System.out.println("C GRADE");
                break;
            case 6:System.out.println("D GRADE");
                break;
            default:System.out.println("FAIL");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        Program2 p2=new Program2();
        p2.gradeSystem(mark);
    }
    
}
