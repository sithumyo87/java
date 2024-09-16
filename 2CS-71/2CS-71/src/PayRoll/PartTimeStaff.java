package PayRoll;

import java.util.*;

///Users/khantphonenaing/Desktop/Exam/2CS-71/src/PayRoll/PartTimeStaff.txt PayRoll.PartTimeStaff 2

public class PartTimeStaff extends Staff{
	private double hourlyRate;
	private int hoursWorked;
	
	public void formatInfo(String info) {
		StringTokenizer st = new StringTokenizer(info, "|");
		setName(st.nextToken());
		this.hourlyRate = Double.parseDouble(st.nextToken());
		this.hoursWorked = Integer.parseInt(st.nextToken());
	}

	
	public void computePay() {
		double pay = hoursWorked * hourlyRate;
		System.out.println("Name                		:" + getName());
		System.out.println("Hourly Rate          		:$" + hourlyRate);
		System.out.println("Hourly worked          		:$" + hoursWorked);
		System.out.println("This month's salary 		:$" + pay);
		System.out.println();
	}
}
