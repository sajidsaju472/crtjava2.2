class Main
{
    public static void main(String[]args)
    {
        float a[]={34.5f,67.2f,55.9f};
        int i;
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(float x:a)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        for (i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}