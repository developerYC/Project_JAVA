package Exception_handling;
import java.util.Scanner;
public class demstring {

	    public static void main(String[] args) {

	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Give the string:");
	   String string=sc.next();
	     //   boolean numeric = true;

	        try {
	          //  Double num = Double.parseDouble(string);
	        	String d=String.valueOf(0);
	            System.out.println("cscc.");
	        } catch (NumberFormatException e) {
	           // numeric = false;
	        	e.printStackTrace();
	        }

	  /*      if(numeric)
	            System.out.println(string + " is a number");
	        else
	            System.out.println(string + " is not a number");
	            */
	    }
	
}
