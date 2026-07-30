class CommandOdd
{
	public static void main(String args[])
	{
		int no1 = Integer.parseInt(args[0]);
		
		System.out.println("0 position: " + no1);
		
		if(no1%2==0)
			{
			System.out.println("even");
			}
		else
			{
			System.out.println("odd");
			}
	}
}