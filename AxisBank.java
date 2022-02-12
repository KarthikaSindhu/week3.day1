package week3.day1;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("My deposit is in Axis Bank");
	}
	
	public static void main(String[] args) {
		
		AxisBank A1 = new AxisBank();
		A1.deposit();
		
	}
}
