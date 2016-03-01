package com.LearnSpring.UseCase;

public class UserDataBO {
	private double billAmount=0;
	private float interestRate=0f;
	
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
		
}
