package com.LearnSpring.Mapper;

public class UserDataVO {
	private double billAmount=0;
	private String cardType=null;
	
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
}
