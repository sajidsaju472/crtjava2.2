import java.util.*;
class leap year or not
{
  public static void main (String[]args)
  {
    int y;
      System.out.println ("enter a year");
    Scanner s = new Scanner (System.in);
      y=s.nextInt ();
    if (y%4==0 && (y%100!=0||y%400==0))
    {
        System.out.println("leap year ");
    }
    else
    {
        System.out.println("not a leap year");
    }
  }
}