package com.LearnSpring.UseCase;
import java.io.Serializable;

public class TotalBillCalculator implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private double billAmount=0;
	private float interestRate=0f;
	
	private double totalBillAmount=0;

	
	public double calculateTotalBill(UserDataBO userData){
	
		billAmount = userData.getBillAmount();
		interestRate = userData.getInterestRate();
		
		System.out.println("From Business" + billAmount);
		System.out.println("From Business"+interestRate);
		
		totalBillAmount = billAmount + ( billAmount * ( interestRate / 100 ) );
		return totalBillAmount;
	}
}
