package assignment3;

import java.util.*;
public class Example 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);

		String firstname,lastname;
		char choice;
		boolean value=true;
		do
		{
			System.out.println("Enter first name: ");
			firstname=input.next();
			System.out.println("Enter last name: ");
			lastname=input.next();
			System.out.println("fistName is: " +firstname+" lastname"+lastname);
			value =false;
			System.out.print("Do You Want To Continue (Y/N)?: ");
			choice=input.next().charAt(0);
		}
		while(choice == 'Y' || choice == 'y');
	}
}