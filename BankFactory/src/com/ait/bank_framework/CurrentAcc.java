package com.ait.bank_framework;

public abstract class CurrentAcc extends BankAcc {

	protected float creditLimit=45000f;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
		// TODO Auto-generated constructor stub
	}

	public float getCreditLimit() {
		return creditLimit;
	}

	@Override
	public void withdraw(float accBal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getCreditLimit()=" + getCreditLimit() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + "]";
	}

}
