class Empwage
{
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int NUM_OF_WORKING_DAYS = 20;
		public static final int MAX_HRS_IN_MONTH = 100;
		
		
		public static int computeEmpWage()
		{
			System.out.println("Welcome to the Employee Wage Computation Program");
				
				int totalEmpWage = 0,totalWorkingDays = 0,totalEmpHrs = 0;
				
				while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
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
					int empWage = empHour * EMP_RATE_PER_HOUR;
					totalEmpWage += empWage;
					System.out.println("Employee Wage is :" + empWage);
				}
				System.out.println("Total Employee Wage is :" + totalEmpWage);
				return totalEmpWage;
		}
		
		public static void main(String args[])
		{
			computeEmpWage();				
		}
}
