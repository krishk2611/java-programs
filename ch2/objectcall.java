class MethodDemo2
{
	void square(int x,int y,int z,int v)
	{
		System.out.println("square :" +(x*y*z*v));
	
	}
	void square(int x,int y)
	{
		System.out.println("square :" +(x*y));
	
	}
	void square(double x,int y)
	{
		System.out.println("square :" +(x*y));
	
	}
	void square(int x,int y,int z)
	{
		System.out.println("square :" +(x*y*z));
	
	}
	public static void main(String args[])
	{
		MethodDemo2 m = new MethodDemo2();
		m.square(2,4,5,0);
		m.square(2,3,3);	
	}

}