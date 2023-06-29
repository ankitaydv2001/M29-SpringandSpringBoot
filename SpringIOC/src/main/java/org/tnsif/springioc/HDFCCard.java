package org.tnsif.springioc;

public class HDFCCard implements DebitCard {

	@Override
	public void deposit() {
		System.out.println("HDFC - Depositing an amount of 1 lakh Rupees");
		
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC - Withdrawing an amount of 20 thousands Rupees");
		
		
	}

}
