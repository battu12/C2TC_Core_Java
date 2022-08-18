package com.ait.generics;

public class DataGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Generic <String> g = new Generic<String>("Good Morning");
		//typecasting is not required by using Generics
		String in = g.getObj();
		System.out.println(in);
	}

}
