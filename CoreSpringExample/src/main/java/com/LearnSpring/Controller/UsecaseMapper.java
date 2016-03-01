package com.LearnSpring.Controller;

import com.LearnSpring.Mapper.UserDataVO;

public interface UsecaseMapper {

	String billAmount =null;
	String cardType=null;
	public double getTotalBill(UserDataVO valuesFromUser);
}
