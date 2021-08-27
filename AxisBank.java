package Week3.day1;

import org.student.student;

public class AxisBank extends BankInfo{
	public  void deposit ()
	{
		 
		System.out.println(" Overriding Deposit Account");
	
	}

public static void main(String[] args)

{
	AxisBank AX = new AxisBank();
	AX.saving();
	AX.fixed();
		AX.deposit();
}


}