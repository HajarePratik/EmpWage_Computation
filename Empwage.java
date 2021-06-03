class Empwage
{
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
	
		//Declearing Varibles
		private final String company;
		private final int empRatePerHour;
		private final int numOfWorkingDays;
		private final int maxHoursPerMonth;
		private int totalEmpWage = 0;
		
	
		//Creating a Constuctor here
		public Empwage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
		{
			this.company = company;
			this.empRatePerHour = empRatePerHour;
			this.numOfWorkingDays = numOfWorkingDays;
			this.maxHoursPerMonth = maxHoursPerMonth;
		}
		
		public int computeEmpWage()
		{
			
				
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
					int empWage = empHour * empRatePerHour;  	// Calculating Employee Wage
					totalEmpWage += empWage; 			// Giving a One By One Wage to the TotalEmpWage Variable
					System.out.println("Day-"+ totalWorkingDays + " Employee Wage is :" + empWage);
				}
				System.out.println("Total Employee Wage for Company "+company+" is:"+ totalEmpWage);
				return totalEmpWage;
		}
		
		public static void main(String args[])
		{
			System.out.println("Welcome to the Employee Wage Computation Program");
			Empwage dmart = new Empwage("DMart",20,2,10); // Creating a Object of Each Company and Calling a Method Using Object
			Empwage reliance = new Empwage("Reliance",10,4,20);
			Empwage ibm = new Empwage("IBM",10,6,30);
			dmart.computeEmpWage();   // Calling Method
			reliance.computeEmpWage();
			ibm.computeEmpWage();
		}
}
