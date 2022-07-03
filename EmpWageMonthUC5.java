//UC5

package Three;

public class EmpWageMonthUC5 {
	
	public static final int PART_TIME=1;
	public static final int FULL_TIME=2;
	public static final int PER_HOUR=20;
	public static final int WORK_DAY=2;
	
	public static void main (String[] args){
	
		int emphrs=0;
		int empwage=0;
		int totalwage=0;
		
		for(int day=0;day<WORK_DAY;day ++){
			
			int empCheck= (int) Math.floor(Math.random()*10%3);
			switch(empCheck)
			{
				case PART_TIME:
					emphrs=4;
					break;
				
				case FULL_TIME:
					emphrs=8;
					break;
					
				default:
					emphrs=0;
					
			}
		}	
			empwage=emphrs*PER_HOUR;
			totalwage +=empwage;
					
			System.out.println("Total Employee Wage :"+totalwage);
	}
}
