import java.util.*;
import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        int a[],i,n,big;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of array");
        n=s.nextInt();
        a=new int[n];
        System.out.println("enter n elements");
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        big=a[0];
        for(i=0;i<n;i++)
        {
            if(big<a[i])
            big=a[i];
        }
        System.out.println("biggest element is="+big);
    }
}