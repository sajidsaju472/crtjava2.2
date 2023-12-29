import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        float a;
        System.out.println("enter a number");
        Scanner s=new Scanner(System.in);
        a=s.nextFloat();
        if(a>0)
        {
            System.out.println("is positive");
        }
        else
        if(a<0)
        {
            System.out.println("is negitive");
        }
        else
        {
            System.out.println(" is zero");
        }
    }
}