package com.ait.genericseg2;

public class Generic_Class_and_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data<Integer,String> obj = new Data<Integer,String> (18,"Virat Kholi"); 
		
		System.out.println("key:" + obj.getKey()+ " " + "value:" + obj.getValue());
		System.out.println();
		obj.print(15, "Ben Stokes");
		
		
	}

}
