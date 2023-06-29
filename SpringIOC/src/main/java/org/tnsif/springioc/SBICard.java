package org.tnsif.springioc;

public class SBICard implements DebitCard{

	@Override
	public void deposit() {
		System.out.println("SBI - Depositing an amount of 1 lakh Rupees");
		
	}

	@Override
	public void withdraw() {
		System.out.println("SBI - Withdrawing an amount of 20 thousands Rupees");
		
	}
	
	

}
