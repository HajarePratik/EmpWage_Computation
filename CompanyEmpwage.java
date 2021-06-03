
public class CompanyEmpwage {

	//Declearing Varibles
	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage = 0;
	
	//Creating a Constuctor here
	public CompanyEmpwage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
	{
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	// set TotalWage Variable to the Method
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
	
}
