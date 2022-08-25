package com.ait.client;

import com.ait.application.GSNormalAcc;
import com.ait.application.GSPrimeAcc;
import com.ait.application.GoShopFactory;

public class GoShoppingClient {

	public static void main(String[] args) {
		GoShopFactory obj=new GoShopFactory();
		//Prime Account creation
		GSPrimeAcc prime=(GSPrimeAcc) obj.getNewPrimeAcc(123, "Damon", 800.0f, true);
		prime.bookProduct(prime.getCharges());
		
		//Normal Account creation
		
		GSNormalAcc normal=(GSNormalAcc) obj.getNewNormalAcc(121, "John", 700.0f,30.0f);
		normal.bookProduct(normal.getCharges());

	}

}
