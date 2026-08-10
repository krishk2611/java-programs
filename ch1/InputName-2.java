//Write a java program to get a name from user and display on screen

import java.lang.*;
import java.util.Scanner;

class InputName-2
{
	public static void main (String args[])
	{
		String name;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("your name is " + name);
		
	}

}