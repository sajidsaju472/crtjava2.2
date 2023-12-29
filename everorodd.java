import java.util.*;
class evenorodd
{
}
{
    public static void main(String[]args)
    {
        int a;
        System.out.println("enter the number");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        if(a%2==0)
        {
            System.out.println(a+"is even");
        }
        else
        {
            System.out.println(a+"is odd");
        }
    }
}