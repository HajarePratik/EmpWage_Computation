class Empwage
{
	public static void main(String args[])
	{
		System.out.println("Welcome to the Employee Wage Computation Program");
		
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		
		int empHour = 0;
		int empWage = 0;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		if(empCheck == IS_FULL_TIME)
		{
				System.out.println("Employee is Present");
				empHour = 8 ;
		}
		else
		{
				System.out.println("Employee is Absent");
				empHour = 0;
		}
		empWage = empHour * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage is :" + empWage);
	}
}