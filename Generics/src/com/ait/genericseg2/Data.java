package com.ait.genericseg2;

class Data <K,V> {
	private K key;
	private V value;
	public Data(K key, V value) {
		
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + ", getKey()=" + getKey() + ", getValue()=" + getValue()
				+ "]";
	}
	
	public <E,N> void print(E elements,N numbers)
	{
	
	System.out.println("Elements :" + " "+ elements+ " " +  "Numbers:" + " " + numbers);
}
}
