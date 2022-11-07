package Exception_handling;
import java.util.Scanner;
import java.lang.String;

public class SString {
	public static String str;
	public static String orgstr,str2="";
	static char ch,upperch,lowerch;

	public static void remove(String orgstr,char ch)
	{
		int len=orgstr.length();
		upperch=Character.toUpperCase(ch);
		lowerch=Character.toLowerCase(ch);
		
		for(int i=0;i<len;i++)
		{
		if((orgstr.charAt(i)!=upperch) && (orgstr.charAt(i)!=lowerch))
		str2=str2+orgstr.charAt(i);
				
		}

	}
	
	public static void display()
		{
		System.out.println("After Removing the character:"+str2);
		}
		
	public static void main(String args[])
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the string=");
			
			orgstr=s.next();
			
			System.out.println("Enter the character to remove from string:");
			ch=s.next().charAt(0);
			s.close();
			remove(orgstr,ch);
			display();
			
		}
	}

