package assignment3;

import java.util.Scanner;
/*http://moriel.smarterthanthat.com/tips/java/java-user-input-validation/
 * http://stackoverflow.com/questions/5073898/why-is-my-program-skipping-a-prompt-in-a-loop*/
/* Start of class Test*/
class Test
{
	Scanner keyboard=new Scanner(System.in);
	public boolean error = false;
	/* Start employee type method to  choose and validate the correct employee type*/
	public char employeeType()
	{
		char empType;
		//boolean error = false;
		do 
		{

			System.out.print("\nEnter employee pay type ('h' for hourly, 's' for salary) ");
			empType=keyboard.next().charAt(0);
			if (empType!='h' && empType!='s') 
			{
				System.out.print("\nInvalid payroll type");
				error = true;
			} 
			else 
			{
				error =false;
			}
		} 
		while (error == true);
		return empType;
	}
	/* end of employee type method*/

	/* Start askInputhours type method to  choose and validate the correct hours of an employee*/
	public double askInputhours()
	{
		double inputHour;	
		boolean again = false;	
		do 
		{
			System.out.print("\nEnter numbers of housrs worked during week: " );
			inputHour =keyboard.nextDouble();
			if (inputHour >60) 
			{
				System.out.print("\nInvalid number worked: ");
				again = true;
			} else
			{
				again = false;
				//return inputHour;
			}
		} while (again == true);
		return inputHour;
	}
	/* end of askInputhours type method*/

	/* Start askWorkRate type method to  choose and validate the correct rate of work of an employee*/
	public double askWorkRate()
	{  
		double hourlyRate;
		boolean value=false;

		do 
		{
			System.out.print("\nEnter hourly rate: ");
			hourlyRate=keyboard.nextDouble();
			if (hourlyRate>25 || hourlyRate<5) 
			{
				System.out.print("\nInvalid number worked: ");
				value = true;
			} 
			else 
			{
				value = false;
				//return hourlyRate;
			}

		}while(value==true);
		return hourlyRate;
	}
	/* end of askInputhours type method*/
	/* Start askAnnualSalary type method to  choose and validate the correct salary range of work of an employee*/
	public double askAnnualSalary()
	{
		double annualSalary;	
		boolean a = false;	
		do 
		{
			System.out.print("\nEnter annual salary: " );
			annualSalary =keyboard.nextDouble();
			if (annualSalary >80000.00 || annualSalary<32000.00) 
			{
				System.out.print("\nInvalid annual salary: ");
				a = true;
			} else
			{
				a = false;

			}
		} while (a == true);
		return (annualSalary/52);
	}
	/* end of askInputhours type method*/

}
/* end of class Test*/

public class PaycalculationDemo
{  

	public static void main(String[] args) 
	{   
		Test test=new Test();
		PayCalculation pay=new PayCalculation();
		Scanner scanner=new Scanner(System.in);
		char choice;
		while(true){
			do
			{
				System.out.print("Enter employee name: ");
				String name= scanner.next();
				char empTypes=test.employeeType();
				if (empTypes=='h')
				{
					double workedHour=test.askInputhours();
					pay.setEmpHour(workedHour);
					double EmpWorkRate= test.askWorkRate();
					pay.setHourRate(EmpWorkRate);
					double grossWeekPay=pay.weeklyPay();
					pay.setEmpSalary(grossWeekPay);
					double totalTax=pay.taxCal();
					double netPay=grossWeekPay-totalTax;
					System.out.print("\n\nweekly payroll infromation for:"+ name);
					System.out.print("\nGross Pay     $"+ (Math.round(grossWeekPay * 100.0) / 100.0) +"\nFederal Tax   $"+(Math.round(totalTax * 100.0) / 100.0)+"\nNet Pay       $"+ (Math.round(netPay * 100.0) / 100.0));

				}
				else  if (empTypes=='s')
				{
					double weeklySalry=test.askAnnualSalary();
					pay.setEmpSalary(weeklySalry);
					double totalTax=(pay.taxCal())/52;
					double netPay=weeklySalry-totalTax;
					System.out.print("weekly payroll infromation for: "+ name);
					System.out.print("\nGross Pay     $"+ (Math.round(weeklySalry * 100.0) / 100.0) +"\nFederal Tax   $"+(Math.round(totalTax * 100.0) / 100.0)+"\nNet Pay       $"+ (Math.round(netPay * 100.0) / 100.0));

				}

				System.out.print("\n\nDo You Want To Continue (Y/N)?: ");
				choice=scanner.next().charAt(0);
			}
			while((choice!='n')&&(choice!='N'));
			if((choice!='y')&&(choice!='Y')){
				System.out.println("Press \"ENTER\" to continue...");
				scanner = new Scanner(System.in);
				scanner.nextLine();

			}
		}
	}
}
