class Constraint
{
	void display()
	{
		System.out.println("HelloWorld Display Method");
	}
	void show(int x)
	{
		System.out.println("Show method "+x);
	}

	Constraint()
	{
		System.out.println("This is default constrant");

	}
	Constraint(int x)
	{
		System.out.println("this is the parameterized constraint:"+x);
	}
	public static void main(String args[])
	{
	Constraint ob=new Constraint();
	Constraint ob2=new Constraint(20);
	ob.display();
	ob.show(22);

	}
}