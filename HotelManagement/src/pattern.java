import java.util.Scanner;
class pattern
{
    public static void main(String[]args)
    {
        int row,i,j,k,space=50,space1=50;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        row=sc.nextInt();
        
        for(i=1;i<=row;i++)
        {
            for(k=1;k<=space;k++)
            {
                System.out.print(" ");
                
                }
            for(j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
             space=space-1;      
        }
         for(i=5;i<=row;i++)
        {
            for(k=1;k<=space1;k++)
            {
                System.out.print(" ");
                
                }
            for(j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
             space1=space1-1;      
        }
    }
}