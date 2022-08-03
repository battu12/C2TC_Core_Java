package com.ait.application;

import com.ait.bank_framework.BankFactory;
import com.ait.bank_framework.CurrentAcc;
import com.ait.bank_framework.SavingAcc;

public class MMBankFactory implements BankFactory{

	private static final float MINBAL = 1000.0f;

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		SavingAcc savingAcc=(SavingAcc) new MMSavingAcc(accNo, accNm, accBal, isSalaried, MINBAL);
		return savingAcc;
		
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		CurrentAcc currentAcc=(CurrentAcc) new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return currentAcc;
	}
	
}
