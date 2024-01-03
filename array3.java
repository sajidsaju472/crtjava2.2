import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        int a[],i,n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of array");
        n=s.nextInt();
        a=new int[n];
        System.out.println("enter n elements");
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("the values are");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}