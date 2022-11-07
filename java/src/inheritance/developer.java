package inheritance;

	class developer extends emp
	{
		int no_proj;
		double 	amt_proj;
		
		developer()
		{
			//super();
			no_proj=3;
			amt_proj=7500;
		}
		
		developer(int id,String n,double s,int np,double ap)
		{
			super(id,n,s);
			no_proj=np;
			amt_proj=ap;
		}
		
		public String toString()
		{
			return super.toString()+" "+no_proj+" "+amt_proj;
		}
	}

