import java.util.*;
class quadratic
{
  public static void main (String[]args)
  {
    int a,b,c;
    System.out.println("enter the values of a,b,c");
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    double r1,r2,d;
    d=b*b-4*a*c;
    if(d<0)
    {
        System.out.println("roots are not possible");
    }
    else
    {
        r1=(-b+Math.sqrt(d))/2*a;
        r2=(-b-Math.sqrt(d))/2*a;
        System.out.println(r1);
        System.out.println(r2);
    }
  }
}