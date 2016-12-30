package assignment3;


import java.io.IOException;
import java.util.Scanner;


public class PaycalDemo
{
	
	public static void main(String[] args) 
	{
		
		
		Scanner scanner=new Scanner(System.in);
		
		boolean h=true;
		while (h){
			PayCal pay=new PayCal();
			
			
		char choice;
		//do
		//{
			
			boolean value=false;
			while (!value)

			{
				System.out.println("Enter employee name: ");
				String name= scanner.next();
			
				System.out.println("Enter employee type ('h' for hourly, 's' for salary) ");
				char empType=scanner.next().charAt(0);
				if (empType == 'h')
				{
					System.out.println("Enter numbers of housrs worked during week: ");
					double workedHour=scanner.nextDouble();
					while (!value) 
					{
						if (workedHour>60) 
						{
							System.out.println("Invalid number worked: ");
							System.out.println("Enter numbers of housrs worked during week: " );
							workedHour=scanner.nextDouble();
							value = false;
						} 
						else 
						{
							//double hour=workedHour;
							pay.setEmpHour(workedHour);
							value = true;	
						}
					}
					System.out.println("Enter hourly rate: ");
					double hourlyRate=scanner.nextDouble();
					System.out.println("you enter: "+ hourlyRate);
					boolean again=true;
					while (again) 
					{
						if (hourlyRate>25.00) 
						{
							System.out.println("Invalid worked rate: ");
							System.out.println("Enter hourly rate: " );
							hourlyRate=scanner.nextDouble();
							System.out.println("you enter: "+ hourlyRate);
							again =true;
						} 
						else 
						{
							//double hourRate=hourlyRate;
							System.out.println("you enter: "+ hourlyRate);
							pay.setHourRate(hourlyRate);;
							again =false;
						}
					}
					//double grossWeekPayment=pay.weeklyPay(workedHour, hourlyRate);
					System.out.println(pay.weeklyPay());
					value=true;
				}
				else if (empType == 's')
				{
					System.out.println("..waiting..");
					value=true;
				} 
				
			}
			System.out.print("Do You Want To Continue (Y/N)?: ");
	        choice=scanner.next().charAt(0);
		//}
		if((choice!='y')&&(choice!='y'))
		{
		System.out.println("Press \"ENTER\" to continue...");
		scanner = new Scanner(System.in);
		   scanner.nextLine();
		}
		
		
	//}
	}

}
}
