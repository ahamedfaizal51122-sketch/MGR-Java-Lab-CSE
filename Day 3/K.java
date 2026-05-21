public class K {
    public static void main(String[] args){
        int row=7;
        int col=5;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if(j==1||i+j==6||i-j==2){        // i+j==6->(i=1,j=5;i=2,j=4;i=3,j=3) i-j==2->(i=4,j=2;i=5,j=3;i=6,j=4) 
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(); // println() -> print on next line (or) new line
        }
    }
    
}

    

