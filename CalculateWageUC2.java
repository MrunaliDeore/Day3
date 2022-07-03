//UC1
//Check Employee is Present or Absent
//- Use ((RANDOM)) for Attendance Check

package Three;

public class CalculateWageUC2 {
	
	public static void main (String[] args){
	
		int FULL_TIME=1;
		int PER_HOUR=20;
		
		int emphrs=0;
		int empwage=0;
		
		double empCheck=Math.floor(Math.random()*10%2);
		
				if(empCheck==FULL_TIME)
					emphrs=8;
				else
					emphrs=0;
				empwage=emphrs*PER_HOUR;
					
				System.out.println("Employee Wage :"+empwage);
	}
}
