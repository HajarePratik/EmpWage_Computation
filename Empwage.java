class Empwage
{
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
	
		
		public static int computeEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
		{
			System.out.println("Welcome to the Employee Wage Computation Program");
				
				int totalEmpWage = 0,totalWorkingDays = 0,totalEmpHrs = 0;
				
				while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
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
					int empWage = empHour * empRatePerHour;
					totalEmpWage += empWage;
					System.out.println("Day-"+ totalWorkingDays + " Employee Wage is :" + empWage);
				}
				System.out.println("Total Employee Wage for Company "+company+" is:"+ totalEmpWage);
				return totalEmpWage;
		}
		
		public static void main(String args[])
		{
			computeEmpWage("DMart",20,2,10);
			computeEmpWage("Reliance",10,4,20);
			computeEmpWage("IBM",10,6,30);
		}
}
