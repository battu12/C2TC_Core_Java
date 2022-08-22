package com.ait.client;

import com.ait.application.MMBankFactory;
import com.ait.application.MMCurrentAcc;
import com.ait.application.MMSavingAcc;

public class BankFactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MMBankFactory obj=new MMBankFactory();
		MMSavingAcc bharath=(MMSavingAcc) obj.getNewSavingAcc(345566, "Bharath", 10000f, true);
		bharath.withdraw(5000);
		MMCurrentAcc bharath1=(MMCurrentAcc) obj.getNewCurrentAcc(365244, "Bharath", 32324f, 50000f);
		bharath1.withdraw(90000);
	}

}
