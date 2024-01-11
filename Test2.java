import java.io.*;
class Test
{
	public static void main(String[]args)
	{
		FileReader f1=new FileReader("kaif.txt") throws Exception
		int ch;
		ch=f1.read();
		while(ch!=1)
		{
			System.out.println((char)ch);
			ch=f1.read();
		}
		f1.close();
	}
}