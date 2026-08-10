class A
{
	void one()
	{
		System.out.println("hello one");
	}
	
}

class B extends A
{
	void two()
	{
		System.out.println("hello two");
	}	
	public static void main(String args[])
	{
		B b = new B();
		b.two();
		b.one();	
	}

}
class C extends B
{
	void three()
	{
		System.out.println("hello three");
	}
	public static void main(String args[])
	{
		C c = new C();
		c.two();	
		c.three();
	}

}