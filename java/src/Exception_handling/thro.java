package Exception_handling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class thro {
	 public static void readFile() throws FileNotFoundException,IOException
	{
		FileInputStream fi=new FileInputStream("E:\\a.txt");
		System.out.println("Reading File..");
		System.out.println("Function Complete.");
		fi.close();
		int x=12;
		System.out.println("x="+x);
	}
	 public static void div() 
	 {
		 int n = 4,d=0;
		 if(d==0)
			 throw new ArithmeticException("Zero is not allowed..."); //Explicitly exception check
		 float divission=(float)n/d;
		 System.out.println("Divission="+divission);
	 }
	 public static void main(String args[]) throws FileNotFoundException,IOException
	 {
		
			 try
		 
		 {
			 readFile();
			 div();
		 }
		 catch(FileNotFoundException e)
		 {
			 e.printStackTrace();
			 System.out.println("File not found..");
		 }
	 }
	 
	 
}
