package assignment3;


public class PayCalculation 
{
	public double empHour, hourRate,empSalary;


	public double getEmpHour() {
		return empHour;
	}

	public void setEmpHour(double empHour) {
		this.empHour = empHour;
	}

	public double getHourRate() {
		return hourRate;
	}

	public void setHourRate(double hourRate) {
		this.hourRate = hourRate;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public double weeklyPay()
	{

		double totalWeekPayment= empHour*hourRate;
		return totalWeekPayment;
	}
	public double taxCal()
	{
		double weekToAnual= empSalary*52;
		double tax = 0;
		if (weekToAnual<12000){
			tax=0;
		}
		else if (weekToAnual>12000 && weekToAnual<=18000){
			tax=0+(weekToAnual-12000)*0.14;
		}
		else if (weekToAnual>18000 && weekToAnual<=29000){
			tax=840+(weekToAnual-18000)*0.16;
		}
		else if (weekToAnual>29000){
			tax=2600+(weekToAnual-29000)*0.19;
		}
		return tax;

	}

}
