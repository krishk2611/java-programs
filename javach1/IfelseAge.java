import java.util.Scanner;
class IfelseAge {
	public static void main(String[] args) {
	System.out.println("Enter Your age'");
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();

	if(age<=18)
	{
		System.out.println("not eligible for vote");	
	}
	else
	{
		System.out.println("Eligible for vote");
	}
     }
}