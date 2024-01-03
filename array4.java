import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        int a[],i,n,Sum=0;
        float avg;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of array");
        n=s.nextInt();
        a=new int[n];
        System.out.println("enter n elements");
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            Sum=Sum+a[i];
        }
        avg=(float)Sum/n;
        {
            System.out.println(Sum);
            System.out.println(avg);
        }
    }
}