package com.ait.client;

import com.ait.application.MMBankFactory;
import com.ait.application.MMCurrentAcc;
import com.ait.application.MMSavingAcc;

public class BankFactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MMBankFactory obj=new MMBankFactory();
		//Saving Account creation
		MMSavingAcc akshi=(MMSavingAcc) obj.getNewSavingAcc(123, "Akshi", 5000.0f, true);
		akshi.withdraw(4000.0f);
		
		MMCurrentAcc madhu=(MMCurrentAcc) obj.getNewCurrentAcc(14523, "Madhu", 5000.0f, 45000f);
		madhu.withdraw(4500.0f);
				
		
	}

}
