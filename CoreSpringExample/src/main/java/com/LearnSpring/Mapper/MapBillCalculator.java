package com.LearnSpring.Mapper;

import java.io.Serializable;
import java.util.Map;
import com.LearnSpring.UseCase.TotalBillCalculator;
import com.LearnSpring.UseCase.UserDataBO;

public class MapBillCalculator implements Serializable {

	private static final long serialVersionUID = 1L;
	private TotalBillCalculator billCalculation = null;
	private double totalBillAmount;
	private UserDataBO userValues;
	private Map<String, Float> interestRate=null;
	
	public MapBillCalculator(Map<String, Float> cardInterestRate,TotalBillCalculator billCalculation){
		this.interestRate=cardInterestRate;
		this.billCalculation=billCalculation;
	}
	
	public double callUseCase(UserDataVO userInput) {
		
		userValues = new UserDataBO();

		userValues.setBillAmount(userInput.getBillAmount());

		userValues.setInterestRate(interestRate.get(userInput.getCardType()));
		
		totalBillAmount = billCalculation.calculateTotalBill(userValues);

		return totalBillAmount;
	}
}
