package com.LearnSpring.Controller;

import java.io.Serializable;
import com.LearnSpring.Mapper.MapBillCalculator;
import com.LearnSpring.Mapper.UserDataVO;

public class UsecaseMapperImpl implements UsecaseMapper,Serializable{
	private static final long serialVersionUID = 1L;
	
	private MapBillCalculator mapBillCalculation;
	private double totalBillAmount = 0;
	private UserDataVO userInput=null;

	public void setMapBillCalculation(MapBillCalculator mapBillCalculation){
		this.mapBillCalculation=mapBillCalculation;
	}
	public double getTotalBill(UserDataVO dataFromUser) {
		this.userInput=dataFromUser;
			
		totalBillAmount=mapBillCalculation.callUseCase(userInput);

		return totalBillAmount;
	}
	
}
