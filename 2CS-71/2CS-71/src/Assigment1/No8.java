package Assigment1;

public class No8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		No8 E8 = new No8(23, 59, 00);
		E8.mode(1);
		
		E8.setTime(8, 15, 0);
		E8.mode(1);
		E8.mode(2);
	}

	int hour, minute, second;
	
	public No8(int hour, int minute, int second) {
		setTime(hour, minute, second);
	}
	
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void mode(int mode) {
		switch (mode) {
		case 1: {
			System.out.printf("%d : %d : %d%n", hour, minute, second);
			break;
		}
		case 2: {
			String preiod = hour < 12 ? "a.m" : "p.m";
			System.out.printf("%d : %d : %s%n", hour, minute, preiod);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + mode);
		}
	}
}

