package collection_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


class Person implements Comparable
{
	public int id;
   public static String name;
   public double per;
	Person(int i,String n,double p)
	{
		id=i;
		name=n;
		per=p;
	}
	public String toString()
	{
		return id+" "+name+" "+per;
	}
	public int compareTo(Object p)
	{
		Person ob=(Person)p;
		if((this.id>ob.id))
			return 1;
		else if(this.id<ob.id)
			return -1;
		else
			return 0;
	//	return this.name.compareTo(p.name);
	}

public static void main(String args[])
{
	ArrayList l=new ArrayList();
	l.add(new Person(11,"raju",78.89));
	l.add(new Person(22,"mukesh",92.3));
	l.add(new Person(66,"Tahur",75.65));
	l.add(new Person(44,"viru",80.40));
	
	System.out.println("Before sort=");
	Iterator i=l.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	//**************************************
	System.out.println("\nAfter sort by id=");
	Collections.sort(l);
	Iterator i2=l.iterator();

	while(i2.hasNext())
	{
		System.out.println(i2.next());
	}
	
	//**************************************
	System.out.println("\nAfter sort by NAME=");
	Collections.sort(l,new Comparebyname());
	Iterator i3=l.iterator();

	while(i3.hasNext())
	{
		System.out.println(i3.next());
	}
	//**************************************
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id to search=");
		int pid=sc.nextInt();

		for(Object o:l)
		{
			Person p2=(Person)o;
			if(p2.id==pid)
			{
				System.out.println("Person found");
				System.out.println("person info=="+p2);
			}
		}
		//**************************************
				System.out.println("Enter name to search=");
				String pname=sc.next();

				for(Object o:l)
				{
					Person p3=(Person)o;
					if(p3.name==pname)
					{
						System.out.println("Person found");
						System.out.println("person info=="+p3.name);
					}
				}
	
}

}