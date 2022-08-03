package com.ait.application;

import com.ait.bank_framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried, float MINBAL) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}
	
	public static final float getMINBAL() {
		return MINBAL;
	}
	
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		if(amount<=(accBal-MINBAL)) {
				super.withdraw(amount);
		System.out.println(" Withdraw of "+ amount + " is successful.");
	}else {
		System.out.println(" Insufficient balance");
	}
	}
	
	@Override
	public String toString() {
		return "MMSavingAcc [isSalaried()=" + isSalaried() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
