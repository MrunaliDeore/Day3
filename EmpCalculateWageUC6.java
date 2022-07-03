//UC6

package Three;

public class EmpCalculateWageUC6 {
	
	public static final int PART_TIME=1;
	public static final int FULL_TIME=2;
	public static final int PER_HOUR=20;
	public static final int WORK_DAY=2;
	public static final int MAX_HRS_MONTH=10;
	
	public static void main (String[] args)
	{
		int emphrs=0;
		int totalemphrs=0;
		int totalworkingdays=0;
		
		while(totalemphrs<=MAX_HRS_MONTH && totalworkingdays<WORK_DAY)
		{
			totalworkingdays ++;
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
		
			totalemphrs +=emphrs;		
			System.out.println("Days :"+totalworkingdays + "Emp Hrs :"+ emphrs);
	}	
		int totalempwage= totalemphrs * PER_HOUR;
		system.out.println("Total Emp wage :"+totalempwage);
}
