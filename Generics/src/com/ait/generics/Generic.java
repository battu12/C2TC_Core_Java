package com.ait.generics;

class Generic <T>{
	private	T obj;

	public Generic(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data_Generic [obj=" + obj + ", getObj()=" + getObj() + "]";
	}
}
