class Sample
{
    int a,b;
    void get()
    {
        a=10;
        b=20;
    }
    void show()
    {
        System.out.println("a="+a+" b="+b);
    }
    public static void main(String[]args)
    {
        Sample s1=new Sample();
        Sample s2=new Sample();
        s1.get();
        s2.get();
        s1.show();
        s2.show();
    }
}