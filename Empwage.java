class Empwage
{
	public static void main(String args[])
	{
		System.out.println("Welcome to the Employee Wage Computation Program");
		
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		
		int empHour = 0;
		int empWage = 0;
		
		double empCheck = Math.floor(Math.random() * 10) % 3;
		
		if(empCheck == IS_FULL_TIME)
		{
				System.out.println("Employee is Present & Doing Full Time");
				empHour = 8 ;
		}
		else if(empCheck == IS_PART_TIME)
		{
			System.out.println("Employee is Present & Doing Part Time");
			empHour = 4;
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