package inheritance;

class emp{
	
	private int empid;
	private String name;
	private double salary;
	
	emp()
	{
		empid=123;
		name="Michal";
		salary=30000;
	}
	
	emp(int eid,String nm,double sal)
	{
		empid=eid;
		name=nm;
		salary=sal;
	}
	
	public String toString()
	{
		return empid+" "+name+" "+salary;
	}
}



