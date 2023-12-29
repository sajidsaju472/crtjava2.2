import java.util.*;
class vowel
{
    public static void main(String[]args)
    {
        char a;
        System.out.println("enter a string");
        Scanner s=new Scanner(System.in);
        a=s.next().charAt(0);
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
        {
            System.out.println(a+" is vowel");
        }
        else
        {
            System.out.println(a+"is consonant");
        }
    }
}