package com.LearnSpring.UserInteraction;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.LearnSpring.Controller.*;
import com.LearnSpring.Mapper.UserDataVO;

public class ConsoleReader {
//	public static void main(String[] args) {
//	      ApplicationContext context = 
//	             new ClassPathXmlApplicationContext("Beans.xml");
//
//	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//
//	      obj.getMessage();
//	   }
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int serviceType = 0;
		double totalBillAmount=0;

		Scanner userInput = new Scanner(System.in);
		serviceType = userInput.nextInt();
		
		if (serviceType == 1){
			ApplicationContext context =
					new ClassPathXmlApplicationContext("Beans.xml");
				
			UsecaseMapper knowYourBill = (UsecaseMapper) context.getBean("control");
			UserDataVO dataFromUser = new UserDataVO();

			Scanner userBill = new Scanner(System.in);
			dataFromUser.setBillAmount(userBill.nextDouble());

			Scanner userCard = new Scanner(System.in);
			dataFromUser.setCardType(userCard.next());
			
			totalBillAmount=knowYourBill.getTotalBill(dataFromUser);
			
			((ConfigurableApplicationContext)context).close();
			System.out.println(totalBillAmount);

		}else{
			System.exit(1);
		}
		
	}
	
}