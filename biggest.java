import java.util.*;
class Smallest
{
    public static void main(String[]args)
    {
        int a,b,c;
        System.out.println("enter three  values values");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a<b && a<c)
        {
          System.out.println(a+"is smallest");
        }
        else
        if(b<c)
        {
            System.out.println(b+"is smallest");
        }
        else
        {
            System.out.println(c+"is smallest");
        }
    }
}