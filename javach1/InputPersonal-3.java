//Write a java program to get personal information from user and display on screen.

import java.lang.*;
import java.util.Scanner;

class InputInformation-3
{
	public static void main (String args[])
	{
		String personal1,personal2,personal3;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name");
		personal1= sc.next();
		
		System.out.println("Enter surname");
		personal2= sc.next();
		
		System.out.println("Enter age");
		personal3= sc.next();
		
		System.out.println("your name is " + personal1);
		System.out.println("your surname is " + personal2);
		System.out.println("your age is " + personal3);
		

		
	}

}