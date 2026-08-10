class MethodDemo
{
	void squareWArg()
	{
		int x=5;
		System.out.println("Square :" + (x*x));
	}
	void squareWithArgs(int x , int y)
	{

		System.out.println("Square:" + (x*y));

	}
	int squareWithReturn(int x)
	{

		return x*x;
	}

	public static void main(String args[])
	{
		MethodDemo m = new MethodDemo();
		m.squareWArg();
		m.squareWithArgs(2,4);
		System.out.println("square of return"+m.squareWithReturn(3));	
	}	


}