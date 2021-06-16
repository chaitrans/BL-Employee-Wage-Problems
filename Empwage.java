public class Empwage
{
	public static void main(String args[])
	{
		Empwage e = new Empwage();
		e.employeeWage();	
	}
	void employeeWage() {
		final int max_working_hrs = 100;
		final int days_in_month=20;
		final int wage_per_hr = 20;
		int working_hr = 0;
		int total_working_hr = 0;
		int monthly_total_wage = 0;
		int is_fulltime_present = 1;
		int is_parttime_present = 2;
		int daily_wage_array[] = new int[20];
		
		int i = 0;
		 
	        while(i<days_in_month && total_working_hr<max_working_hrs){
			int emp_check = (int)(Math.floor(Math.random() * 10)) % 3;
			switch (emp_check) {
				case 1:
					working_hr = 8;
					break;
				case 2:
					working_hr = 4;
					break;
				default:
					working_hr = 0;
			}
			i++;
			total_working_hr += working_hr;
			daily_wage_array[i] = working_hr * wage_per_hr;
		}
		//To display each day salary
		for (int j=0; j<days_in_month; j++) {    
			int day = j+1;
			System.out.println("Day " + day + " wage is " + daily_wage_array[j]);
			monthly_total_wage = monthly_total_wage + daily_wage_array[j];
		}
		System.out.println("\nMonthly wage is " + monthly_total_wage);
	}

}