import java.util.ArrayList;
import java.util.HashMap;  		// Importing a ArrayList,Hashmap,Map Package
import java.util.Map;

public class Empwage implements InterfaceEmpwage
{
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
	
		private ArrayList<CompanyEmpwage> companyEmpArrayList;    // Declearing a Arraylist, Map Object 
		private Map<String, CompanyEmpwage> companyToEmpWageMap;
		
		public Empwage()
		{
			companyEmpArrayList = new ArrayList<CompanyEmpwage>();     // Initallizing ArrayList,Hashmap in Default Constructor
			companyToEmpWageMap = new HashMap<>();
		}

		public void addCompanyEmpwage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
		{
			CompanyEmpwage companyEmpwage = new CompanyEmpwage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
			companyEmpArrayList.add(companyEmpwage);
			companyToEmpWageMap.put(company, companyEmpwage);   // Adding a Value to Method
		}
		public void computeEmpWage()
		{
			for (int i = 0; i<companyEmpArrayList.size();i++)
			{
				CompanyEmpwage companyEmpWage = companyEmpArrayList.get(i);
				companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
				System.out.println("Company Name : "+ companyEmpWage.company);
				DisplayDailyWageforCompany(companyEmpWage);
				System.out.println("Total Wage is: "+ companyEmpWage.totalEmpWage);
			}
		}
		public void DisplayDailyWageforCompany(CompanyEmpwage companyEmpwage)
		{
			for(int i=0; i<companyEmpwage.empDailyWage.size();i++)
			{
				int day = i + 1;
				System.out.println("Daily Wage For Day" + day +":" + companyEmpwage.empDailyWage.get(i));  // Getting Wages and Displaying a Daily Wage For Day
			}
		}
		public int getTotalWage(String company)
		{
			return companyToEmpWageMap.get(company).totalEmpWage;      // Getting a Total EmpWage and Return to Map Method
		}
		public int computeEmpWage(CompanyEmpwage companyEmpWage)
		{
				
				int totalEmpWage = 0,totalWorkingDays = 0,totalEmpHrs = 0;
				
				while(totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays)
				{
					int empHour = 0;
					totalWorkingDays++;
					int empCheck = (int) Math.floor(Math.random() * 10) % 3;
					
					switch(empCheck)
					{
						case IS_FULL_TIME:
						System.out.println("Employee is Present & Doing Full Time");
						empHour = 8 ;
						break;
						
						case IS_PART_TIME:
						System.out.println("Employee is Present & Doing Part Time");
						empHour = 4;
						break;
						
						default:
						System.out.println("Employee is Absent");
						empHour = 0;
					
					}
					totalEmpHrs += empHour;   // Calculting a EmpHour and Printing a Emp Hour
					System.out.println("Day-"+ totalWorkingDays + " Employee Hour is :" + empHour);
				}
				return totalEmpHrs * companyEmpWage.empRatePerHour;   // Multiply Total EmpHrs with Rate Per Hour and Returning the Value
		}
		
		public static void main(String args[])
		{
			System.out.println("Welcome to the Employee Wage Computation Program");
			Empwage emp = new Empwage();       				// Creating a Object of Class
			emp.addCompanyEmpwage("DMart",20, 2, 10);
			emp.addCompanyEmpwage("Reliance",10, 4, 20);			// Calling a addCompany Method and Add One By One Company To The ArrayList
			emp.computeEmpWage(); 						// Calling a Method
			System.out.println("Total Wage for DMart : " + emp.getTotalWage("DMart"));  // Display a Total Wage and Accessing a getTotalWage Method with the Help of Object
			System.out.println("Total Wage for Reliance : " + emp.getTotalWage("Reliance"));
			
		}
}
