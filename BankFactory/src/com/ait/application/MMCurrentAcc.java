package com.ait.application;

import com.ait.bank_framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		if(amount<=creditLimit) {
			super.withdraw(amount);
				System.out.println(" Withdraw of "+ amount + " is successful.");
		}else {
			System.out.println(" Insufficient balance");
	}
		
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [getCreditLimit()=" + getCreditLimit() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + "]";
	}

	@Override
	public void deposite(float accBal) {
		// TODO Auto-generated method stub
		
	}

	
	

	
	}
	


