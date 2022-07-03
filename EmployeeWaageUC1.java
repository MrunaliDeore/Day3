//UC1
//Check Employee is Present or Absent
//- Use ((RANDOM)) for Attendance Check

package Three;

public class EmployeeWaageUC1 {
	
	public static void main (String[] args){
	
		int FULL_TIME=1;
		double empCheck=Math.floor(Math.random()*10%2);
		
				if(empCheck==FULL_TIME)
					System.out.println("Employee is present");
				else
					System.out.println("Employee is not presenr");
	}
}
