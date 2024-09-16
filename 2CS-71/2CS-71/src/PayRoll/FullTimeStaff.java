package PayRoll;

import java.util.*;

///Users/khantphonenaing/Desktop/Exam/2CS-71/src/PayRoll/FullTimeStaff.txt PayRoll.FullTimeStaff 2

public class FullTimeStaff extends Staff {
	private double dailyRate;
	private double overtimeHourlyRate;
	private int daysWorked;
	private int overtimeHoursWorked;
	
	public void formatInfo(String info) {
		StringTokenizer st = new StringTokenizer(info, "|");
		setName(st.nextToken());
		
		this.dailyRate = Double.parseDouble(st.nextToken());
		this.overtimeHourlyRate = Double.parseDouble(st.nextToken());
		this.daysWorked = Integer.parseInt(st.nextToken());
		this.overtimeHoursWorked = Integer.parseInt(st.nextToken());
	}

	
	public void computePay() {
		double pay = ((dailyRate * daysWorked) + (overtimeHoursWorked * overtimeHourlyRate));
		
		System.out.println("Name                		:" + getName());
		System.out.println("Daily Rate          		:$" + dailyRate);
		System.out.println("Overtime hourly worked      :$" + overtimeHourlyRate);
		System.out.println("Days worked           		:$" + daysWorked);
		System.out.println("Overtime hours worked 		:" + overtimeHoursWorked);
		System.out.println("This month's salary 		:$" + pay);
		System.out.println();
	}
}
