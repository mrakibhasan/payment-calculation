package assignment3;



public class PayCal {
	public double empHour, hourRate;
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
   public double weeklyPay(){
	  
	   double totalWeekPayment= empHour*hourRate;
	   return totalWeekPayment;
   }
   
}
