import java.util.ArrayList;

public class Empwage implements InterfaceEmpwage
{
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
	
		private ArrayList<CompanyEmpwage> companyEmpArrayList;
		
		
		public Empwage()
		{
			companyEmpArrayList = new ArrayList<CompanyEmpwage>();
		}

		public void addCompanyEmpwage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
		{
			CompanyEmpwage companyEmpwage = new CompanyEmpwage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
			companyEmpArrayList.add(companyEmpwage);
		}
		public void computeEmpWage()
		{
			for (int i = 0; i<companyEmpArrayList.size();i++)
			{
				CompanyEmpwage companyEmpWage = companyEmpArrayList.get(i);
				companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
				System.out.println(companyEmpWage.company+" Total Wage is: "+ companyEmpWage.totalEmpWage);
			}
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
					totalEmpHrs += empHour;
					System.out.println("Day-"+ totalWorkingDays + " Employee Hour is :" + empHour);
				}
				return totalEmpHrs * companyEmpWage.empRatePerHour;
		}
		
		public static void main(String args[])
		{
			System.out.println("Welcome to the Employee Wage Computation Program");
			Empwage emp = new Empwage();
			emp.addCompanyEmpwage("DMart",20, 2, 10);
			emp.addCompanyEmpwage("Reliance",10, 4, 20);
			emp.computeEmpWage();
		}
}
