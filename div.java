import java.util.*;
class div
{
    public static void main(String[]args)
    {
        int a,b,r;
        Scanner s=new Scanner(System.in);
        System.out.println("enter two numbers");
        a=s.nextInt();
        b=s.nextInt();
        if(b==0)
        {
            System.out.println("second number cannot be zero");
            b=1;
        }
        r=a/b;
        System.out.println(r);
    }
}