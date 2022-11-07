package inherit;

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

class developer extends emp
{
	int no_proj;
	double 	amt_proj;
	
	developer()
	{
		//super();
		no_proj=1;
		amt_proj=4700;
	}
	
	developer(int id,String n,double s,int np,double ap)
	{
		super(id,n,s);
		no_proj=np;
		amt_proj=ap;
	}
	
	public String toString()
	{
		return super.toString()+no_proj+" "+amt_proj;
	}
}

class employee{
public static void main(String args[])
{
	//emp e=new emp();

	developer d=new developer();
	
	System.out.println(d);
}
}