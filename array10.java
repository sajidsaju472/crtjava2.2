import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        int a[][],i,j,m,n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of matrix");
        m=s.nextInt();
        n=s.nextInt();
        a=new int[m][n];
        System.out.println("enter the elements");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("the matrix is");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("the transpose is");
                for(i=0;i<n;i++)
                {
                    for(j=0;j<m;j++)
                    {
                        System.out.print(a[i][j]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}