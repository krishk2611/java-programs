interface I1
{
	public abstract void display();
	

}
class ClassInterface implements I1
{
	public void display()
	{
		System.out.println("Display");
	}
	public static void main (String args[])
	{
		ClassInterface cm=new ClassInterface ();
		cm.display();
	}

}