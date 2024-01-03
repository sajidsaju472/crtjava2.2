import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        int a[][],i,j,n,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of matrix");
        n=s.nextInt();
        a=new int[n][n];
        System.out.println("enter the elements");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i+j==n-1)
                sum=sum+a[i][j];
            }
        }
        System.out.println("sum of diagonal elements="+sum);
    }
}