public class G {
    public static void main(String[] args){
        int row=7;
        int col=5;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if(i==1||j==1||i==7||j==5  &&i!=2&&i!=3||i==j &&i>3){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
