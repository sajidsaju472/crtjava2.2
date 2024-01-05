class Sample
{
    int admno;
    String name; 
    void get(int x,String y)
    {
        admno=x;
        name=y;
    }
    void show()
    {
        System.out.println("admission no="+admno+" Name="+name);
    }
    public static void main(String[]args)
    {
        Sample s1=new Sample();
        s1.get(27877,"Shajid");
        s1.show();
        Sample s2=new Sample();
        s2.get(30628,"kaifu");
        s2.show();
    }
}