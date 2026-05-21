import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args) {
        //jagged array
        int a[][]={
            {1,2,3},
            {4},
            {6,7}
        };

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        

        int b[][]=new int[3][];
        b[0]=new int[3];
        b[1]=new int[1];
        b[2]=new int[2];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }   

        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
