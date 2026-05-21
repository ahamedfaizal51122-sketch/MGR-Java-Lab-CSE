// write a program to perform matrix multiplication?
public class MatrixMultiplication {
    public static void main(String[] args){
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int b[][]={
            {1,1},
            {2,2},
            {3,3}
        };
        int m=a.length;//3  row of A array
        int n=a[0].length;//3 column of A array
        int p=b[0].length;//2 column of B array
        int c[][]=new int[m][p];
        if(n==b.length)
        {
            //3 for loops
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<p;j++)
                {
                    for(int k=0;k<n;k++)
                    {
                            c[i][j]+=a[i][k]*b[k][j]; // c[i][j]=c[i][j]+a[i][k]*b[k][j];
                    }
                }
            }
        }else{
            System.out.println("INVALID ROWS");
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<c[i].length;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }   
    }   
}