import java.io.*;
class Test
{
public static void main(String[]args) throws Exception
	{
	FileWriter f1=new FileWriter ("abc.txt");
	f1.write('d');
	f1.write(97);
	f1.write("java");
	f1.write("python");
	f1.flush();
	f1.close();
	}
}