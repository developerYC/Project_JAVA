package inheritance;

public class student {
	
	public static void average(String name,int arr[])
	{
		int sum=0;
		for(int x :  arr)  // foreach loop
		{
			sum=sum+x;
		}
		float avg=sum/arr.length;
		System.out.println("student name "+ name +" Average "+ avg);
	}
	
	public static void main(String args[])
	{
		int arr1[]= {78,6,90,77,65};
		int arr2[]= {78,6,90,77,65};
		
		average("abc",arr1);
		average("xyz",arr2);
	}

}
