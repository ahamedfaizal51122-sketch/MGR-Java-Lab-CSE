import java.util.Scanner;
public class Program31 {
    void findDays(int month, int year) {
        switch (month) {
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                    System.out.println("29 days");
                else
                    System.out.println("28 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 days");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        Program31 obj = new Program31();
        obj.findDays(month, year);
    }
}
